package auladia11;
import java.util.Scanner;
import java.util.Locale;

public class ExercList1_5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		float a = input.nextInt();
		float b = input.nextInt();
		float c = input.nextInt();
		
		double d = Math.sqrt((b * b) - (4*a*c));
		
		if (d >= 0) {		
			double r_1 = (- b + d) / (2 * a);
			double r_2 = (- b - d) / (2 * a);
			
			System.out.printf("A primeira raiz � igual a: %f\nA segunda raiz � igual a: %f", r_1, r_2);
		} else {
			System.out.println("N�o h� ra�zes reais para tal equa��o");
		}

		input.close();
		
	}
}

