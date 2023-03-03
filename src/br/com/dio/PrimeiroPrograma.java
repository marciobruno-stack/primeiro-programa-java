package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livros = new Livro();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Ola mundo " + (a+b));*/

	}

}

class Livro {
	private String nome;
	private String npag;
	
}
