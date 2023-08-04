package mstech.springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    
    @GetMapping("/")
    public String home(){
        return ("<h1>Hola! Comos Estas?</h1>");
    }
}
