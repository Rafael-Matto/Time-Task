/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethod;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author Group s - Shamrock
 * Participants:
 * -Thayene Lorens (student number : 2020293)
 * -Marco Antônio dos Santos (student number : 2020333)
 * -Rafael Matos (student number: 2020345)
 */
public class boyfriend {
         
    
    static void Nationality (){
       
       /**
        * @author: Rafael Matos
        * Student number: 2020345
        */
      Scanner myKB = new Scanner(System.in);
      
      String country;
      
      try{
        System.out.println("Where is he from?");
        country = myKB.nextLine();
        
        if (country.matches("[a-zA-Z]+")){
            System.out.println("He is from " + country + ".\n");
        }
        else{
            System.out.println("This is not a country.");
        }
      }catch (Exception e){
       
       }
   static int status() {
         /**
     * author: Marco dos Santos
     * Student Number: 2020333
     */
   
        //String status;
        Scanner mkb = new Scanner(System.in);
        
        System.out.println("What is your marital status? please choose: 1 single, 2 married, 3 divorced and 4 if you prefer not to say");
        int status = mkb.nextInt();
        
      
        switch(status){
            case 1:
                System.out.println("Single\n");   
            break;
            case 2:
                System.out.println("Married\n");   
            break;
            case 3:
                System.out.println("Divorced\n");   
            break;
            default:
                System.out.println("I prefer not to say\n");  
                
           // return age; 
        
        } 
         return 0;
     }
  
       }
     }