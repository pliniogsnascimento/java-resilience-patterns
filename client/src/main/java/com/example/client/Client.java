package com.example.client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "message", url = "http://localhost:8090")
@CircuitBreaker(name="MessageCircuitBreaker")
public interface Client {

    @RequestMapping(method = RequestMethod.GET, value = "/v1/hello")
    public String getMessage();
}
