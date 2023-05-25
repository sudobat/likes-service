package com.caixabanktech.arq.likes.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import com.caixabanktech.arq.likes.service.entities.Like;
import com.caixabanktech.arq.likes.service.services.TweetLikesService;
import com.caixabanktech.arq.likes.service.services.TweetLikesServiceImpl;

@TestInstance(Lifecycle.PER_CLASS)
@TestConfiguration("com.caixabanktech.arq.likes.service")
public class TweetLikesServiceTest {

       
	private String hostName="locahost";
	private Short portNumber=6379;
    private TweetLikesService tweetLikesService;

	@BeforeAll
	public void beforeTest(){
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(new RedisStandaloneConfiguration(this.hostName, this.portNumber));
        this.tweetLikesService = new TweetLikesServiceImpl(jedisConnectionFactory);
	}


    @Test
    public void test_TweetAddLike() {
        Like like = new Like("id0001","pepe");
        this.tweetLikesService.tweetAddLike(like);

    }

    @Test
    public void test_TweetRemoveLike() {
        Like like = new Like("id0001","pepe");
        this.tweetLikesService.tweetRemoveLike(like);
    }

    @Test
    public void test_TweetDeleteLikes() {
        this.tweetLikesService.tweetDeleteLikes("id0001");
    }

    
    @Test
    public void test_tweetGetNunLikes()  {
        
        
        this.tweetLikesService.tweetGetNunLikes("id0001");
    }

}
