package feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="spring-cloud-eureka-client", url="http://localhost:8005/getVersion")
public interface GreetingClient {
    @GetMapping
    String greeting();
}
