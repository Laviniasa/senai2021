package auladia11;

import java.util.Scanner;
import java.util.Locale;

public class ExercList2_1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float a, b, c, d, e;
		
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		d = input.nextFloat();
		e = input.nextFloat();
		
		System.out.printf("A m�dia dos 5 n�meros �: %.2f", ((a + b + c + d + e)/5) );
		
		input.close();
	}
}
