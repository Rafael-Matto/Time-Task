/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethod;

import java.util.Scanner;
import static mymethod.boyfriend.introduction;

/**
 *
 * @author Thay
 */
public class MyMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        introduction();
        Scanner input = new Scanner(System.in);
        boyfriend bf = new boyfriend();
        System.out.println("Enter the name of first boyfriend here: ");
        
        String temp = input.nextLine(); //The name we type is stored in the variable temp.
        
        bf.setName(temp); //
        
        bf.saying();// boy name = X. Uses the saying.
                
        boyfriend age = new boyfriend();
        
        System.out.println("What was his age?");
        
        int answer = input.nextInt();
        
        age.setAge(answer);
        Nationality();

    }
    
}
