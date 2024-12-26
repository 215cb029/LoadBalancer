//package com.java.load.balancing.config;
//
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
////import org.springframework.web.reactive.function.client.WebClient;
//@Profile(value = "prod")
//@Configuration
//@LoadBalancerClient(name= "product-service", configuration = ProductConfiguration.class)
//public class WebclientConfiguration {
//    @Bean
//    @LoadBalanced
//    public WebClient.Builder builder(){
//        return WebClient.builder();
//    }
//
//}
