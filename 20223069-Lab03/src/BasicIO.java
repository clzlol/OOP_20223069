import java.util.*;

// An exploration of basic input and output.
class BasicIO {

   // Reads and processes string input.
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      // get first input
      System.out.print("Enter your name: ");
      String name = stdin.nextLine();

      // get age
      System.out.print("Enter your age: ");
      int years = stdin.nextInt();

      // get height
      System.out.print("Enter your height: ");
      int height = stdin.nextInt();

      // display output on console
      System.out.println("your name is " + name);
      System.out.println("yout age is " + years);
      System.out.println(years * 365);
      System.out.printf("%1$tY년 %1$tB %1$te일 현재 %4$s(%2$d)의 키는 %3$d cm 입니다.", new Date(), years, height, name);

   } // method main

} // class BasicIO
