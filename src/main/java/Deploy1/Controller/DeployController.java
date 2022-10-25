package Deploy1.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {

    @GetMapping("/")
    public String getName(@Value("${spring.devName}") String name){
        return name;
    }
}
