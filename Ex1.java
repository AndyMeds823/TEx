import java.util.Scanner;
public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter temp in Fahrenheit");
		double fahren = in.nextDouble();
		double cel = ((fahren-32)*5/9);
		System.out.println(fahren +" "+" F equals "+" "+cel+" C");
	}
}
/*1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
*/