package main.java.doip.simulation.http.server.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimulationController {
    
    @GetMapping("/")
    public String index() {
        return "Hello, World!";
    }
}