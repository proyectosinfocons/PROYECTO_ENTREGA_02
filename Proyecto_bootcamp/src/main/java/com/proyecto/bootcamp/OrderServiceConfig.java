package com.proyecto.bootcamp;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import org.springframework.web.reactive.function.BodyInserters;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;


@Configuration
@EnableReactiveMongoRepositories(basePackages = "com.proyecto.bootcamp.repository")
public class OrderServiceConfig  extends AbstractReactiveMongoConfiguration{  

    @Value("${mongodb.port}")
    private String port;
	     
	
    @Value("${mongodb.dbname}")
    private String dbName;
 
    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return new ReactiveMongoTemplate(reactiveMongoClient(), getDatabaseName());
    }

	@Override
	public MongoClient reactiveMongoClient() {
		// TODO Auto-generated method stub
		return MongoClients.create();
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return dbName;
	}
}