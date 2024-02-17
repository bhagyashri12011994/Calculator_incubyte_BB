package org.example;

public class Calculator {
    private double num1;
    private double num2;

    private String Operator;

    public double evaluate(double num1,double num2,String op)
    {
        double result=0;
        switch (op)
        {
            case "+" : result= num1+num2;
                        break;
            case "-" : result= num1-num2;
                break;
            case "*" : result= num1*num2;
                break;
            default:System.out.println("Enter wrong input");
                break;
        }
        return result;
    }
}
