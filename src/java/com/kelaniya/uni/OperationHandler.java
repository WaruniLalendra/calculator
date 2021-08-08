package com.kelaniya.uni;

import com.kelaniya.uni.GetData;

import java.util.Scanner;

public class OperationHandler {

    public void selectOperation(){

        int operation = 1;
        double answer = 0.0;
        Scanner scanner = new Scanner(System.in);
        GetData data = new GetData();

        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.print("Enter the operation: ");

        operation = scanner.nextInt();


        switch (operation) {
            case (1):
                answer = data.num1 + data.num2;
                break;
            case (2):
                answer = data.num1 - data.num2;
                break;
            case (3):
                answer = data.num1 * data.num2;
                break;
        }

        System.out.println("The answer is: "+answer);
    }
}
