package com.love.yourself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.love.yourself.repository")
public class YourselfApplication {

	public static void main(String[] args) {
		SpringApplication.run(YourselfApplication.class, args);
	}

}
