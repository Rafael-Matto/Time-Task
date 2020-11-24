/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethod;

import java.util.Scanner;

/**
 * @author Group s - Shamrock
 * Participants:
 * -Thayene Lorens (student number : 2020293)
 * -Marco Antônio dos Santos (student number : 2020333)
 * -Rafael Matos (student number: 2020345)
 */
public class boyfriend {
       
    String boyName;
    
    public void setName (String name){
    
    /**
     * author: Thayene Lorens
     * Student Number: 2020293
     */
        
    boyName = name;
    }
    
    public String getName (){
         
    /**
     * author: Thayene Lorens
     * Student Number: 2020293
     */
        
    return boyName;
    }
   
    public void sentence(){
         
    /**
     * author: Thayene Lorens
     * Student Number: 2020293
     */
        
        System.out.println("Your first boyfriend's name was " + getName() + ".\n");
    }
    public int setAge(int age){
        
    /**
     * author: Thayene Lorens
     * Student Number: 2020293
     */
               
    if (age >= 0 && age < 18){
            
        System.out.println("OMG! He was too young to date, still a babe!\n");
    }
        
    else if(age == 18){
            
        System.out.println("He was about your age!\n");
    }
        
    else if (age < 0) {
         
        System.out.println("That is impossible. Liar! He doesn't exist!\n");
    } 
        
    else if(age > 18 && age <= 25){
            
        System.out.println("Great! He was marriage material!\n");
    }
        
    else if (age >= 26 && age <=34){
            
        System.out.println("He was a bit old for you\n");
    }    
        
    else if (age >= 35 && age <=100){
            
        System.out.println("He was a sugar daddy!\n");
    }
        
    else {
            
        System.out.println("That is unlikely to have happened. Were you dating a mummy?\n");
    }                   
        
    return age;
    }
        
   public static void introduction(){
       
       System.out.println("Please, tell us the story of your very first relationship.\n");
   }
  
     }
    private boolean inputhasNextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   }
}
   
