package com.java.load.balancing.config;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
@Configuration
public class ProductConfiguration {
@Bean
    ServiceInstanceListSupplier serviceInstanceListSupplier(){
        return new ProductServiceInstanceSupplier("product-service");
    }

}


class ProductServiceInstanceSupplier implements ServiceInstanceListSupplier {
private String serviceId;
    ProductServiceInstanceSupplier(String serviceId){
        this.serviceId=serviceId;
    }
    @Override
    public String getServiceId() {
        return serviceId;
    }

    @Override
    public Flux<List<ServiceInstance>> get() {
        return Flux.just(Arrays.asList(
new DefaultServiceInstance(serviceId + "1" , serviceId,"localhost",9091,false),
                new DefaultServiceInstance(serviceId + "2" , serviceId,"localhost",9092,false)
        ));
    }
}
