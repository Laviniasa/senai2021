package client;//� o mesmo que cliente ou Vis�o ou View (MVC)Camadas (Padr�o de Projeto)

/*
 * Escrever N�meros por estenso entre 0 e 100
 * */

import javax.swing.JOptionPane;

import controller.Estenso;

public class MainClass {

	private static Estenso num;
	private static String entrada;
	private static String saida;

	public static void main(String[] args) {
		num = new Estenso();
		int val = 0;
		while (val >= 0 && val <= 100) {
			entrada = JOptionPane
					.showInputDialog("Digite um inteiro entre 0 e 100 para escrev�lo ou maior que 100 para sair:");
			try {
				val = Integer.parseInt(entrada);
			} catch (Exception e) {
				val = 101;
				System.out.println(e);
			}
			saida = num.getValor(val);
			saida = saida.substring(0, 1).toUpperCase().concat(saida.substring(1));
			System.out.println(val + ", " + saida);
		}

	}

}
