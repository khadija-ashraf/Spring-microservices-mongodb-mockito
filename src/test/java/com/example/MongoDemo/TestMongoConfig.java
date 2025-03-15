//package com.example.MongoDemo;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
//import org.testcontainers.containers.MongoDBContainer;
//
//@Configuration
//public class TestMongoConfig {
//
//    private static final MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:5.0.10");
//
////    static {
////        mongoDBContainer.start();
////    }
////
////    @Bean
////    public MongoTemplate mongoTemplate() {
////        return new MongoTemplate(new SimpleMongoClientDatabaseFactory(mongoDBContainer.getReplicaSetUrl()));
////    }
//}