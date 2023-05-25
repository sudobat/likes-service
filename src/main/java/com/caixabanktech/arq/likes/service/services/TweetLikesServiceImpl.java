package com.caixabanktech.arq.likes.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.caixabanktech.arq.likes.service.entities.Like;

@Service
public class TweetLikesServiceImpl implements TweetLikesService {

    private RedisTemplate redisRemplate;

    @Autowired
    public TweetLikesServiceImpl(RedisTemplate redisTemplate) {
        this.redisRemplate = redisTemplate;
    }

    public RedisTemplate getRedisTemplate() {
        return this.redisRemplate;
    }

    @Override
    public void tweetAddLike(Like like) {

        getRedisTemplate().opsForHyperLogLog().add(extractedLikeKey(like.getTweetId()), like.getAuthor());
    }

    @Override
    public void tweetRemoveLike(Like like) {
        getRedisTemplate().opsForHyperLogLog().add(extractedDislikeKey(like.getTweetId()), like.getAuthor());
    }

    @Override
    public void tweetDeleteLikes(String tweetId) {

        getRedisTemplate().opsForHyperLogLog().delete(tweetId + "_LIKE");
        getRedisTemplate().opsForHyperLogLog().delete(tweetId + "_DISLIKE");
    }

    @Override
    public int tweetGetNumLikes(String tweetId) {
        return getRedisTemplate().opsForHyperLogLog().size(extractedLikeKey(tweetId)).intValue();
        

    }

    private String extractedLikeKey(String id) {
        return id + "_LIKE";
    }

    private String extractedDislikeKey(String id) {
        return id + "_DISLIKE";
    }
}