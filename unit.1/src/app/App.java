package app;

public class App {
    public static void main(String[] args) throws Exception {
       
      for (int i = 1; i <= 10; i++){

      if (i % 2 == 0){
          System.out.println(i + " is an even number");
      }
      else{
          System.out.println(i + " is an odd number");
      }
     }


      System.out.println("All finished");
    }
}