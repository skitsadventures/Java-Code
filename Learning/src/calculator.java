/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */     

import java.util.Scanner;

public class calculator {


    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, answer;
        boolean flag = true;
        String choice;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the first integer?");
        num1 = input.nextInt();
        System.out.println("What is the second integer?");
        num2 = input.nextInt();
        answer = 0;
        System.out.println("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division");
        while (flag){
            choice = input.nextLine();
            switch(choice){
                case "1":
                    answer = num1 + num2;
                    flag = false;
                    break;
                case "2":
                    answer = num1 - num2;
                    flag = false;
                    break;
                case "3":
                    answer = num1 * num2;
                    flag = false;
                    break;
                case "4":
                    if (num2 == 0){
                        System.out.println("Uh oh! You cannot divide by 0, pick a different operation!");
                    }else{
                        answer = num1 / num2;
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("Please input a number between 1 and 4");
                    break;
            }
        }
         System.out.println("The answer is: " + answer);
    }

}