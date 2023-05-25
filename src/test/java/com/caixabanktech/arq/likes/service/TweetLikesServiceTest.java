package com.caixabanktech.arq.likes.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import com.caixabanktech.arq.likes.service.entities.Like;
import com.caixabanktech.arq.likes.service.services.TweetLikesService;
import com.caixabanktech.arq.likes.service.services.TweetLikesServiceImpl;




public class TweetLikesServiceTest {

    // @Autowired
    // private RedisTemplate redisTemplate;
    // private TweetLikesServiceImpl tweetLikesService;

    // @BeforeEach
    // private void beforeEach() {
    //     this.tweetLikesService= new TweetLikesServiceImpl(redisTemplate);
    // }
       

    // @Test
    // public void test_TweetAddLike() {
    //     Like like = new Like("id0001","pepe");
    //     this.tweetLikesService.tweetAddLike(like);

    // }

    // @Test
    // public void test_TweetRemoveLike() {
    //     Like like = new Like("id0001","pepe");
    //     this.tweetLikesService.tweetRemoveLike(like);
    // }

    // @Test
    // public void test_TweetDeleteLikes() {
    //     this.tweetLikesService.tweetDeleteLikes("id0001");
    // }

    
    // @Test
    // public void test_tweetGetNunLikes()  {
        
        
    //     this.tweetLikesService.tweetGetNunLikes("id0001");
    // }

}
