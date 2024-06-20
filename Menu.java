package livraria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			System.out.println("|            5 - Login                                |");
			System.out.println("|            6 - Sair                                 |");
			System.out.println("|_____________________________________________________|");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			if (opcao == 6) {
				System.out.println("\nA Livraria BECO D agradece a sua preferência!");
				sobre();
                 leia.close();
				System.exit(0);

		}
			switch (opcao) {
			
			case 1 ->
			System.out.println("Livros ordenados por nome:\n\n");
			
			case 2 ->
			System.out.println("Livros ordenados por gênero:\n\n");
			
			case 3 ->
			System.out.println("Adicionar livros no carrinho:\n\n");
			
			case 4 ->
			System.out.println("Meu carrinho:\n\n");
			
			case 5 ->
			System.out.println("Fazer Login:");
			
			
			}
		

	}

}

	private static void sobre() {
		// TODO Auto-generated method stub
		
	}
}
