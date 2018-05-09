package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Controller
public class RedisController {

	/**
	* jedis
	*/
	@Autowired
	private JedisPool jedisPool;
	
	
	@RequestMapping("/")
	public String index(){
		Jedis jedis = jedisPool.getResource();
		System.out.println(222222);
		System.out.println("redis1"+jedis.get("age"));
		System.out.println("redis2"+jedis.get("name"));
		jedis.close();
		return "index" ;
	}
}
