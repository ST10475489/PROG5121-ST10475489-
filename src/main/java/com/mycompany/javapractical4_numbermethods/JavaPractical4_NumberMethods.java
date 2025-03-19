/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javapractical4_numbermethods;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class JavaPractical4_NumberMethods {

    public static void main(String[] args) {
    
        //get the first number from the user
        int num1 = getNumber("Enter the first number:");
        
        //get the second number from the user
        int num2 = getNumber("Enter the second number:");
        
        //calculate the sum using a method
        int sum = addNumbers(num1, num2);
        
        //Display the result
        JOptionPane.showMessageDialog(null, "The sum is: " +sum);
    }
    //Method that requires parameters and returns a value
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    //Method to get a number from the user and convert it to an interger
    public static int getNumber(String message) {
        String input = JOptionPane.showInputDialog(message);
        return Integer.parseInt(input);
    }
}

