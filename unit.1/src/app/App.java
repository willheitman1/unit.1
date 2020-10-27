package app;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception { 
        
        Scanner input = new Scanner(System.in);


        Random rnd = new Random();

        while (true){
        
        System.out.println("would you like to make a inside or outside bet");
            String answer1 = input.nextLine();

             if (answer1.equals("inside")){
                 System.out.println("what number would you like to bet on");
                 int answer2 = input.nextInt();
                 int n2 = rnd.nextInt(37);
                 System.out.println("genrated number is " + n2);

                 if(n2 == answer2){
                     System.out.println("your right!");
                     System.out.println("if you want to bet again say bet if you would like to withdraw say withdraw");
                     String answer3 = input.nextLine();
                     if(answer3.equals("bet")){
                         System.out.println("next round "); 
                     }
                     else{
                         System.out.println("Thank you");
                         break;
                     }
                    }
                 else{
                     System.out.println("your wrong");
                      System.out.println("if you want to bet again say bet if you would like to withdraw say withdraw");
                     String answer4 = input.nextLine();
                     if(answer4.equals("bet")){
                         System.out.println("next round");
                         }

                          else{
                         System.out.println("Thank you");
                         break;
                         }
                         
                     }
                     }
                     else{
                         System.out.println("Thank you");
                         break;
                 }

                }

    }

} 