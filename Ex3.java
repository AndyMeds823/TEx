import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	 int firstDigit = num % 10;
     int remainingNumber = num / 10;
     int SecondDigit = remainingNumber % 10;
     remainingNumber = remainingNumber / 10;
     int thirdDigit = remainingNumber % 10;
     remainingNumber = remainingNumber / 10;
     int fourthDigit = remainingNumber % 10;
     int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
     System.out.println("The sum of all digits in " + num + " is " + sum);
	}

}

/*3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
*/