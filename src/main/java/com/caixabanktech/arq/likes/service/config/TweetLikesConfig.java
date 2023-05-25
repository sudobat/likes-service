package com.caixabanktech.arq.likes.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class TweetLikesConfig {

    @Bean
    JedisConnectionFactory jedisConnectionFactory(
            @Value("${com.caixabanktech.arq.likes.service.hostname:localhost}") String hostName,
            @Value("${com.caixabanktech.arq.likes.service.port:6379}") Short portNumber) {
        RedisStandaloneConfiguration sconf = new RedisStandaloneConfiguration(hostName, portNumber);
        return new JedisConnectionFactory(sconf);
    }

}