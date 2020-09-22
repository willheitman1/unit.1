package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "red";
        

       while (count < 667) {
           System.out.println("The count is " + count);
           count = count + 1;
       }
       while (color == "red"){
           System.out.println("the color is " + color);
           color = "green";
       }

       System.out.println("count finished");
    }
}