/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class L4q1{

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int num1 = input.nextInt();
        System.out.println("Enter second integer");
        
        int num2 = input.nextInt();
        int square1 = num1*num1;
        int square2 = num2*num2;
        int sumSquare = square1 + square2;
        int diffsquare = square1 - square2;
        
        System.out.println("square of number 1:" + square1);
        System.out.println("square of number 2:" + square2);
        System.out.println("Sum of both square:" + sumSquare);
        System.out.println("Differences of both squares" + diffsquare);
    
}

}
    

        

