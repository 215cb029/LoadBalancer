package com.java.load.balancing.controller;

import com.java.load.balancing.ProductClient;
import com.java.load.balancing.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.lang.reflect.Type;
import java.util.List;

@RestController
public class LoadBalancerController {
//@Autowired
//private WebClient.Builder builder;
@Autowired
private ProductClient productClient;
//@GetMapping("/get")
//    public Mono<List<Product>> getAllProduct(){
//       return builder.build().get().uri("http://product-service/api/v1/products")
//               .retrieve()
//               .bodyToMono(new ParameterizedTypeReference<List<Product>>() {});
//    }
@GetMapping("/getAll")
    public List<Product> getProducts(){
return productClient.getProducts();
    }



}
