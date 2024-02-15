import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
      
      Scanner console = new Scanner(System.in);
      int a = console.nextInt();
      int b = console.nextInt();
      
      //сравнение
            if(a == b) 
      {
        System.out.println("a=b");
      }
      else
          if(a<b)
          {
            System.out.println("a<b");
          }
          else
           {
              System.out.println("a>b");
           }

      // Операции
      System.out.println ("(a + b)= "+ (a + b));
      System.out.println ("(a - b)= "+ (a - b));
      System.out.println ("(b - a)= "+ (b - a));
      System.out.println("(a * b)= "+ (a*b));
      System.out.println ("(a/b)= "+ (a/b));
      System.out.println ("(b/a)= "+ (b/a));
