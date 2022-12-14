package co.develhope.Deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/somma")
public class Controller {

    @GetMapping
    public Integer somma(){
        int somma = (int) ((Math.random() * 100) + (Math.random() * 100));
        return somma;
    }
}
