package com.RashidG.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String calculator(){
        return "Welcome to calculator";
    }

    public String plus(String num1, String num2) {
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        return  num1 + " + " + num2 + " = " + sum;
    }

    public String minus(String num1, String num2) {
        int dif = Integer.parseInt(num1) - Integer.parseInt(num2);
        return num1 + " - " + num2 + " = " + dif;
    }

    public String multiply(String num1, String num2) {
        int mult = Integer.parseInt(num1) * Integer.parseInt(num2);
        return num1 + " * " + num2 + " = " + mult;
    }

    public String divide(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        String result;
        if (n2 == 0) {
//            throw new
            throw new IllegalArgumentException("Can'd divide to 0!");
//            result = "Cant divide to 0";
        } else {
            double div = (double) n1/(double)n2;
            result = num1 + " / " + num2 + " = " + div;
        }
        return result;
    }
}
