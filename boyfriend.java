/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethod;

import java.util.Scanner;
import static mymethod.boyfriend.Nationality;
import static mymethod.boyfriend.introduction;
import static mymethod.boyfriend.status;
import static mymethod.boyfriend.measureOfBmi;
import static mymethod.boyfriend.timeLine;


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
          //Using Scanner for input.
           
        
       try{
           //Calling this method to input the intoductory sentence of this program.
           introduction(); 
        
           //Using Scanner for input.
           Scanner input = new Scanner(System.in); 
        
           //Code to make it possible to access the 'boyfriend' class.
           boyfriend bf = new boyfriend();    
       
        
           //The name we type is stored in the variable 'word'.
           String word ; 
        
    /*loop in case user inputs number or other digits instead of just letters. 
     The loop ends when user types letters only.*/
      System.out.println("His name has to be text only! \nEnter the name of first boyfriend here: ");
           word = input.nextLine();
    if(word.matches("[a-zA-Z]+")){
        boyfriend age = new boyfriend();         
        
           System.out.println("What was his age?");
        
           int answer = input.nextInt();
     
           age.setAge(answer);
           
          
            
           //It gets the word that was input and set it equals to boyName.
           bf.setName(word); 
           
           //Calling this method so the sentence can be output.
           bf.sentence();
           bf.getName();
           status();
           Nationality ();
           measureOfBmi();
           timeLine();
    }else{
                System.out.println("This is not are a character, it is a number please try again!");
                }
        
          
           
    }
        catch (Exception e){           
           System.out.println("His age has to be a number only.");
        }
       
    }
 } 
