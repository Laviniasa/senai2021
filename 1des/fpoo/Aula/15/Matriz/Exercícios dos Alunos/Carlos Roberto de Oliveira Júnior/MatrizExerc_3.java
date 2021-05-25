package auladia24_2;

import java.util.Random;
import java.util.Locale;
public class MatrizExerc_3 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Random gerador = new Random();
		double[][] matriz = new double[gerador.nextInt(9)+1][gerador.nextInt(9)+1]; 
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int col = 0; col < matriz[linha].length; col++) {
				matriz[linha][col] = (gerador.nextInt(100) + gerador.nextDouble());
				System.out.printf("%.2f ", matriz[linha][col]);
			}
		System.out.println();	
		}
		int numero_de_linhas = linhasMatriz(matriz);
		System.out.printf("\nO n�mero de linhas dessa matriz �: %d.\n", numero_de_linhas);
		System.out.printf("\nO n�mero de linhas dessa matriz �: %d.\n", linhasMatriz(matriz));//Posso chamar o m�todo direto no print;
	}
	
	private static int linhasMatriz(double[][] matriz) {
		int numero_de_linhas = 0;
		for(int linha = 0; linha < matriz.length; linha++) {
			numero_de_linhas++;
		}
		return numero_de_linhas;
	}
}
