package projetobiblioteca;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.setNome("LEITURA CERTA");
		
		Livros livro = new Livros();
		
		System.out.println("Bem Vindos a biblioteca "+biblioteca.getNome());

	}

}
