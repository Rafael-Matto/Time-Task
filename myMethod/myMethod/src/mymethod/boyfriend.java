/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethod;

/**
 *
 * @author Thayene Lorens
 */
public class boyfriend {
       
    String boyName;
    
    public void setName (String name){
        
    boyName = name;
    }
    
    public String getName (){
        
    return boyName;
    }
    public void saying(){
        
        System.out.println("Your first boyfriend's name was " + getName() + ".\n");
    }
    public int setAge(int age){
        
        if (age >= 0 && age < 18){
            
            System.out.println("OMG! He was too young to date you.");
        }
        else if(age == 18){
            System.out.println("He was your age!");
        }
        else if (age < 0) {
         System.out.println("That is impossible.");
        } 
        else if(age > 18 && age <= 25){
            
            System.out.println("Ideal");
        }
        else if (age >= 26 && age <=100){
            
            System.out.println("Too old for you");
        }
        else {
            System.out.println("That ain't possible");
        }
        return age;
    }
   public static void introduction(){
       
       System.out.println("Please, tell us the story of your very first relationship.\n");
   }
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
            System.out.println("He is from " +country);
        }
        else{
            System.out.println("This is not a country!");
        }
      }catch (Exception e){
       }
}
}