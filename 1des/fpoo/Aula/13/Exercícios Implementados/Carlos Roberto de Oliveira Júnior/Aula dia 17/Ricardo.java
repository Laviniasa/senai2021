package auladia17;

import java.util.Scanner;

public class Ricardo {
	public static void main(String[] args) {
		float a, b, c;
		float x1, x2, y1, y2, z1, z2;

		Scanner valor = new Scanner(System.in);

		System.out.println("Insira o 1� valor: ");
		a = valor.nextFloat();

		System.out.println("Insira o 2� valor: ");
		b = valor.nextFloat();

		System.out.println("Insira o 3� valor: ");
		c = valor.nextFloat();

		x1 = a - b;
		x2 = a + b;

		y1 = a - c;
		y2 = a + c;

		z1 = c - b;
		z2 = c + b;

		if (x1 < c && c < x2) {
			System.out.printf("Com estes valores � poss�vel formar um tri�ngulo");
		} else if (y1 < b && y1 < y2 && b < y2) {
			System.out.printf("Com estes valores � poss�vel formar um tri�ngulo");
		} else if (z1 < a && z1 < z2 && a < z2) {
			System.out.printf("Com estes valores � poss�vel formar um tri�ngulo");
		} else {
			System.out.printf("Estes valores n�o resultam em um tri�ngulo");
		}
	}
}
