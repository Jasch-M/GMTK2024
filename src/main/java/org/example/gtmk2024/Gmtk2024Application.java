package org.example.gtmk2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Gmtk2024Application {
    public static void main(String[] args) {
        SpringApplication.run(Gmtk2024Application.class, args);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }


}
