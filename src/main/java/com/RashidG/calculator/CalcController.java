package com.RashidG.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcServiceImpl calcService;

    public CalcController(CalcServiceImpl calcService){
        this.calcService = calcService;
    }

    @GetMapping(path = "/calculator")
    public String calculator(){
        return calcService.calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        return calcService.plus(num1,num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        return calcService.minus(num1,num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        return calcService.multiply(num1,num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        return calcService.divide(num1,num2);
    }
}
