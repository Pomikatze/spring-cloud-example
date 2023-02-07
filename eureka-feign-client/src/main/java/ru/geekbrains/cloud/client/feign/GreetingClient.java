package ru.geekbrains.cloud.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-simple-client")
public interface GreetingClient {
    @GetMapping("/greeting")
    String greeting();

    @GetMapping("/parametrized/{id}")
    String parametrized(@PathVariable(value = "id") String id);
}
