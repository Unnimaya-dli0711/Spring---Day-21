package com.example.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping ("/calculate")
    public String calculate(
            @RequestParam String operation,
            @RequestParam double num1,
            @RequestParam double num2)
    {
        double result;
        switch (operation){
            case "add":
                result=num1+num2;
                break;
            case "subtract":
                result=num1-num2;
                break;
            case "multiply":
                result=num1 * num2;
                break;
            case "divide":
                if(num2==0)
                    return "divide by zero error";
                else
                result=num1/num2;
                break;
            default:
                return "error";
        }
        return "Result : "+result;
    }
}
