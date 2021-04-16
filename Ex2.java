import java.util.Scanner;

public class Ex2 {
	 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Entter value in inch: ");
    double inch = input.nextDouble();
    double meters = inch * 0.0254;
    System.out.println(inch + " inch equals " + meters + " meters");
 }
}