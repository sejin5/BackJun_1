import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner input_int = new Scanner(System.in);
		
		double A = input_int.nextInt();
		double B = input_int.nextInt();
		
		double C = A/B;
		
		System.out.println(C);
	}
}
