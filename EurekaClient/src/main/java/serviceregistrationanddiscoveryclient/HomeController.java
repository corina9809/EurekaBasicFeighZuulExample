package serviceregistrationanddiscoveryclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/getVersion")
    public String getVersion(){
        return "{\"version\": 1.0}";
    }
}
