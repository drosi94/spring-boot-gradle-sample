package es.asegnz.spring.boot.gradle.sample;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}