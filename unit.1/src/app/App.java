package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception { 
      int count = 0;
      String color = "red";


      while (count <= 719) {
          System.out.println("the count is " + count);
          count = count + 1;
        
      }

      System.out.println("count finished");

      while (color == "red"){
          System.out.println("the color is " + color);
          color = "blue";
      }

      System.out.println("color finished");
        }
}