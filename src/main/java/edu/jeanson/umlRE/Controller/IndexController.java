package edu.jeanson.umlRE.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String racine (){
        return "<h1>Le serveur marche bien</h1>";
    }
}
