import java.util.Scanner;
public class Ex4 {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
        System.out.print("Enter 6 digits: ");
        int input = in.nextInt();
        int num1 = input / 100000 % 10;
        int num2 = input / 10000 % 10;
        int num3 = input / 1000 % 10;
        int num4 = input / 100 % 10;
        int num5 = input / 10 % 10;
        int num6 = input % 10;
      System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);

 }
}
/*
 4. Write a Java program to break an integer into a sequence of individual digits.

Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
  */
