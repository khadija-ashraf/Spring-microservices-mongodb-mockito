//package com.example;
//
//import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import reactor.core.publisher.Mono;
//
//@Service
//public class ApiService {
//	
//	private final WebClient webClient;
//	
//	public ApiService(WebClient webclient) {
//		this.webClient = webclient;
//	}
//	
//	public Mono<String> getUserById(String id){
//		return webClient.get()
//				.uri("/{"+id+"}")
//				.retrieve()
//				.bodyToMono(String.class);
//	}
//
//}
