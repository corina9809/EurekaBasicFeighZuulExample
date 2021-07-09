package feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
@Service
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
