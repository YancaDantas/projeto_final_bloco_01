package livraria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.Obras;

public class Menu {

	public static void main(String[] args) {
		
		Obras obras = new Obras("O Senhor dos Anéis", "Fantasia", "J.R.R. Tolkien", "Editora XPTO");
		
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println(" _____________________________________________________");
			System.out.println("|                                                     |");
			System.out.println("|                   LIVRARIA BECO D                   |");
			System.out.println("|_____________________________________________________|");
			System.out.println("|                                                     |");
			System.out.println("|            1 - Consultar Livro por Nome             |");
			System.out.println("|            2 - Consultar Livro por Gênero           |");
			System.out.println("|            3 - Adicionar livro no Carrinho          |");
			System.out.println("|            4 - Meu carrinho                         |");
			System.out.println("|            5 - Cadastrar Livro Novo                 |");
			System.out.println("|            6 - Login                                |");
			System.out.println("|            7 - Sair                                 |");
			System.out.println("|_____________________________________________________|");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Entre com um número do menu!");
				leia.nextLine();
				opcao = 0;
			}
			
			if (opcao == 7) {
				System.out.println("\nA Livraria BECO D agradece a sua preferência!");
				sobre();
                 leia.close();
				System.exit(0);

		}
			switch (opcao) {
			
			case 1 -> {
			System.out.println("Livros ordenados por nome:\n\n");
			keypress();	}
			
			case 2 -> {
			System.out.println("Livros ordenados por gênero:\n\n");
			keypress();}
			
			case 3 -> {
			System.out.println("Adicionar livros no carrinho:\n\n");
			keypress(); }
			
			case 4 -> {
			System.out.println("Meu carrinho:\n\n");
			keypress(); }
			
			case 5 -> {
			System.out.println("Cadastrar livro novo:");
			keypress(); }  
			
			case 6 -> {
			System.out.println("Fazer login ou novo cadastro:");
			keypress(); }
			
			
			}
		

	}

	}
	
	public static void keypress() {
		try {
			System.out.println("Pressione Enter para continuar..");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressinou uma tecla diferente de enter!");
		}
	}

	private static void sobre() {
		// TODO Auto-generated method stub
		
	}
}

