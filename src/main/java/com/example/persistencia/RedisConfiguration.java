package com.example.persistencia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisConfiguration {
	@Bean
	JedisConnectionFactory jedisConectionFactory() {
		return new JedisConnectionFactory();
	}
	
	@Bean
	RedisTemplate<String, Libro> redisTemplate(){
		final RedisTemplate<String, Libro> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConectionFactory());
		return redisTemplate;
	}
}
