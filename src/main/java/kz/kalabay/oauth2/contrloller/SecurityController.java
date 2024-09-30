package kz.kalabay.oauth2.contrloller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("/")
    public String home(){
        return "Hello, Home";
    }
    @GetMapping("/secured")
    public String secured(){
        return "Hello, Secured";
    }
}
