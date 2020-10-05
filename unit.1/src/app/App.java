package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a number");
        int number = input.nextInt();

        int count = 0;

        while(count < number) {
            count = count + 1;
        for (int i = 0; i <= 1000; i = i +1){
            System.out.println("the count is " + i);
        }
        }

    }
}