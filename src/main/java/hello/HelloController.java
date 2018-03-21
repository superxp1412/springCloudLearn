package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        System.out.println("test for the commit");
        System.out.printf("fix the bug test");
        return "Greetings from Spring Boot!";
    }
    
}
