package com.example.calc;
import java.util.Scanner;

public class Calc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int firstNum = Data();
        char action = getAction();
        int secondNum = Data();
        double result = Calculation(firstNum, secondNum, action);
        System.out.println("Calculation result = " + result);
    }
    public static int Data() {
        System.out.println("Enter value: ");
        int num;
        if (scanner.hasNextInt()){
            num = scanner.nextInt();
        }
        else {
            System.out.println("Invalid value. Please enter the valid integer value.");
            scanner.next();
            num = Data();
        }
        return num;
    }
    public static char getAction() {
        System.out.println("Enter the action (+,-,/,*): ");
        char action;
        if (scanner.hasNext())
            action = scanner.next().charAt(0);
        else {
            System.out.println("Please enter valid value.");
            scanner.next();
            action = getAction();
        }
        return action;
    }
    public static double Calculation(double firstNum, double secondNum, char action) {
        double result;

        switch (action) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    System.out.println("Invalid value. In this simple calculator, division by zero is not allowed. Please select a different value.");}
                result = firstNum / secondNum;
                break;

            default:
                System.out.println("Invalid Action, please enter valid value.");
                result = Calculation(firstNum, secondNum, getAction());

        }
        return result;
    }

}
