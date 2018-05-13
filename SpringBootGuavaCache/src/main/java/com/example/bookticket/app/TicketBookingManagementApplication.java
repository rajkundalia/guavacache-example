package com.example.bookticket.app;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;

import com.google.common.cache.CacheBuilder;

@SpringBootApplication
@EnableCaching
public class TicketBookingManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementApplication.class, args);
	}
	
	@Bean
	public CacheManager cacheManager(){
		GuavaCacheManager cacheManager = new GuavaCacheManager();
        cacheManager.setCacheBuilder(CacheBuilder.newBuilder().expireAfterWrite(24, TimeUnit.HOURS));
        cacheManager.setCacheNames(Arrays.asList("ticketsCache"));
		return cacheManager;
	}

}
