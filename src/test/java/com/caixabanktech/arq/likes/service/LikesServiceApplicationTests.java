package com.caixabanktech.arq.likes.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LikesServiceApplicationTests {
	@Value("${hostname:localhost}")
	private String hostName;

	@Value("${port:6379}")
	Short portNumber;

	private JedisC



	@Test
	void contextLoads() {
	}

}
