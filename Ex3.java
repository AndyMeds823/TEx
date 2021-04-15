import java.util.Scanner;

public class Ex3 {

    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int first = num % 10;
        int remainingNumber = num / 10;
        int Second = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int third = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourth = remainingNumber % 10;
        int sum = third + Second + first + fourth;
        System.out.println("The sum of  " + num + " is " + sum);
    }
}
/*
3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16


 */