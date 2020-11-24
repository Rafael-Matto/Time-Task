/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethod;

import java.util.Scanner;
import static mymethod.boyfriend.Nationality;
import static mymethod.boyfriend.closure;
import static mymethod.boyfriend.introduction;
import static mymethod.boyfriend.status;

/**
 *
 * @author Group s - Shamrock
 * Participants:
 * -Thayene Lorens (student number : 2020293)
 * -Marco Antônio dos Santos (student number : 2020333)
 * -Rafael Matos (student number: 2020345)
 */
public class MyMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
           //Calling this method to input the intoductory sentence of this program.
           introduction(); 
        
           //Using Scanner for input.
           Scanner input = new Scanner(System.in); 
        
           //Code to make it possible to access the 'boyfriend' class.
           boyfriend bf = new boyfriend();
        
           //Basic prompt to tell the user what to do.
           System.out.println("Enter the name of first boyfriend here: "); 
        
           //The name we type is stored in the variable 'word'.
           String word = input.nextLine(); 
        
    /*loop in case user inputs number or other digits instead of just letters. 
     The loop ends when user types letters only.*/
    while(!word.matches("[a-zA-Z- ',]+")){
        
           System.out.println("His name has to be text only.\nEnter the name of first boyfriend here: \n");
                      
           word = input.nextLine();
           
       }
           //It gets the word that was input and set it equals to boyName.
           bf.setName(word); 
           
           //Calling this method so the sentence can be output.
           bf.sentence();
           //Calling the method getName.
           bf.getName();
         
    try{
          
           boyfriend age = new boyfriend();
        
           System.out.println("What was his age?");
        
           int answer = input.nextInt();
           
           //Calling the method 'setAge'.
           age.setAge(answer);
    }
    catch (Exception e){
           
           System.out.println("His age has to be a number only.");
    }
            status();
            closure();
            
     }
    } 

    
