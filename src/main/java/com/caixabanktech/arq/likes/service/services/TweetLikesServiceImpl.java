package com.caixabanktech.arq.likes.service.services;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import com.caixabanktech.arq.likes.service.entities.Like;

public class TweetLikesServiceImpl implements TweetLikesService {

    private JedisConnectionFactory theFactory;

    public TweetLikesServiceImpl(JedisConnectionFactory theFactory) {
        this.theFactory = theFactory;
    }

    @Override
    public void tweetAddLike(Like like) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tweetAddLike'");
    }

    @Override
    public void tweetRemoveLike(Like like) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tweetRemoveLike'");
    }

    @Override
    public void tweetDeleteLikes(String tweetId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tweetDeleteLikes'");
    }

    @Override
    public int tweetGetNumLikes(String tweetId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tweetGetNunLikes'");
    }




}