package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
                      
System.out.println("ENTER PASSWORD");

                        Scanner input = new Scanner(System.in);

        String answer1 = input.nextLine();

        if (answer1.equals("0719")){
            System.out.println("CORRECT");
        }

        else{
        System.out.println("INCORRECT");
                System.out.println("ENTER PASSWORD");
        }
    }
}