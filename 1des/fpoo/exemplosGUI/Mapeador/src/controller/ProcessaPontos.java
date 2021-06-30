package controller;

import java.util.ArrayList;

import domain.Ponto;
import domain.dao.PontoDAO;

public class ProcessaPontos {

	public static ArrayList<Ponto> pontos = new ArrayList<>();
	private static PontoDAO pd = new PontoDAO();

	public static void lerArquivo() {
		pontos = pd.abrir();
	}

	public static boolean salvar() {
		if (pd.salvar(pontos)) {
			return true;
		} else {
			return false;
		}
	}

	//Excuir este m�todo ao final do programa, utilizado somente para teste, caso n�o haja arquivo
	public static void preencheTestes() {
		pontos.add(new Ponto("RK01PT00", "Switch Principal", "switch.png", "TI", "TI", null));
		pontos.add(new Ponto("RK01PT01", "PC Recep��o", "pc.png", "TI", "Recep��o", "RK01PT00"));
		pontos.add(new Ponto("RK01PT02", "Laptop Diretor", "pc.png", "TI", "Diretoria", "RK01PT00"));
		pontos.add(new Ponto("RK01PT03", "PC ADM", "pc.png", "TI", "Administra��o", "RK01PT00"));
		pontos.add(new Ponto("RK01PT04", "Switch Secund�rio", "switch.png", "TI", "Corredor", "RK01PT00"));
		pontos.add(new Ponto("RK02PT01", "PC Almoxarifado", "pc.png", "Corredor", "Almoxarifado", "RK01PT04"));
		pontos.add(new Ponto("RK02PT02", "PC Balc�o", "pc.png", "Corredor", "Balc�o 1", "RK01PT04"));
		pontos.add(new Ponto("RK02PT03", "PC Balc�o", "pc.png", "Corredor", "Balc�o 2", "RK01PT04"));
	}
	
	public static String[] getPais(){
		String retorno = "";
		for(Ponto p: pontos) {
			if(p.getIcone().equals("switch.png") || p.getIcone().equals("roteador.png") )
				retorno += ","+p.getId();
		}
		return retorno.split(",");
	}
}
