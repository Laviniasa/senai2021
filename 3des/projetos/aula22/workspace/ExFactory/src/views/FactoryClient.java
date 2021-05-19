package views;

import models.OSFactory;
import models.SistemaOperacional;

///* 
//* Exemplo do Design Pattern de Cria��o Factory
//* https://www.youtube.com/watch?v=pt1IbV1aSZ4
//* */

public class FactoryClient {

	//Classe que garante a cria��o do objeto de acordo com o par�metro escolhido
	private static OSFactory osf = new OSFactory(); 	
	
	public static void main(String[] args) {
		
		SistemaOperacional os = osf.getInstance("Outro");
		System.out.println(os.getTipo());

	}

}
