package MeuPacote1;

public class TestadoraLivro {

	public static void main(String[] args) {
		
		Livro gameOfThrone = new Livro();
		gameOfThrone.setNome("Game of Throne");
		gameOfThrone.setAssunto("Jogo");
		gameOfThrone.setAutor("Pedro");
		gameOfThrone.setData("12/04/1960");
		gameOfThrone.setEdicao("3ed");
		gameOfThrone.setPreco(1.99f);
		gameOfThrone.setTema("Terror e com�dia");
		
		
		/*gameOfThrone.nome = "Game of Throne";
		gameOfThrone.assunto = "Jogo";
		gameOfThrone.autor = "Pedro";
		gameOfThrone.data = "12/04/1960";
		gameOfThrone.edicao = "3ed";
		gameOfThrone.genero = "com�dia";
		gameOfThrone.preco = 1.99f;
		gameOfThrone.tema = "Terror e com�dia";*/
		
		//System.out.println(gameOfThrone.tema);
		System.out.println(gameOfThrone.getNome());
		System.out.println(gameOfThrone.getAssunto());
		

	}
}
