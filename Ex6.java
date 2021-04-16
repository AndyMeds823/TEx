import java.util.Scanner;

public class Ex6 {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int num1 = in.nextInt();
			int num2 = in.nextInt();
			System.out.println("Signed integers: " + num1 + ", " + num2);
			System.out.println("-----------------------------------------");
			int compare_Signed = Integer.compare(num1, num2);
			System.out.println("Signed numbers: " + compare_Signed);
			int compare_Unsigned = Integer.compareUnsigned(num1, num2);
	        System.out.println(" Unsigned numbers: " + compare_Unsigned);
	    }
}
