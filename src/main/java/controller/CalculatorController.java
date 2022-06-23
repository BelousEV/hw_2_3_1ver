package controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    @GetMapping (produces = MediaType.TEXT_HTML_VALUE)
    public String greetings() {
        return " <h1>Добро пожаловать в калькулятор </h1>";
    }




}
