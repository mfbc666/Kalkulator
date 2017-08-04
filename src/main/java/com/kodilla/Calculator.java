package com.kodilla;
import java.util.Scanner;

class Calculation {
    double countAddition (double a, double b){
        double answer = a+b;
        return answer;
    }
    double countSubstaction (double a, double b){
        double answer = a+b;
        return answer;
    }
    double countMultiplication (double a, double b){
        double answer = a+b;
        return answer;
    }
    double countDivision (double a, double b){
        double answer = a+b;
        return answer;
    }
}

public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double answer = 0;

        Calculation calculation = new Calculation();

        System.out.println("Welcome in Calculator!");
        System.out.println("Legend :");
        System.out.println("Please type type of action");
        System.out.println("Please type first number :");
        double a = Double.parseDouble(reader.nextLine());
        System.out.println("");
        System.out.println("Please type second number :");
        double b = Double.parseDouble(reader.nextLine());
        System.out.println("");
        System.out.println("Legend :");
        System.out.println(" Please type + to add");
        System.out.println("Please type - to substract");
        System.out.println("Please type  / to divide");
        System.out.println("Please type * to multiply");

        String typeOfAction = reader.nextLine();

        if(typeOfAction.equals("-")){
            answer = calculation.countSubstaction(a,b);
        }
        if(typeOfAction.equals("+")){
            answer = calculation.countAddition(a,b);
        }
        if(typeOfAction.equals("*")){
            answer = calculation.countMultiplication(a,b);
        }
        if(typeOfAction.equals("/")){
            answer = calculation.countDivision(a,b);
        }
        System.out.println("Result : " + answer);


    }
}
