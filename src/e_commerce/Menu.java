package e_commerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			
			System.out.println(" ____________________________ ");
			System.out.println("|                            |");
			System.out.println("|     *Celulares e cia.*     |");
			System.out.println("|____________________________|");
			System.out.println("|                            |");
			System.out.println("|1 - Listar Produtos         |");
			System.out.println("|2 - Comprar Produto         |");
			System.out.println("|3 - Buscar Produto          |");
			System.out.println("|4 - Pagamento               |");
			System.out.println("|0 - Encerrar                |");
			System.out.println("|____________________________|");
			System.out.println("|                            |");
			System.out.println("|  Digite a opção desejada:  |");
			System.out.println("|____________________________|");
			
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				System.out.println("\n  *Obrigada por sua visita e volte sempre!* ");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("\nListar Produtos \n");

				break;
			case 2:
				System.out.println("\nComprar Produto \n");

				break;
			case 3:
				System.out.println("\nBuscar Produto - por marca\n");

				break;
			case 4:
				System.out.println("\nPagamento\n");

				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}

	}
	
	public static void sobre() {
		System.out.println(" ______________________________________________________________ ");
		System.out.println("|                                                              |");
		System.out.println("| Projeto Final Bloco 1                                        |");
		System.out.println("| Desenvolvido por:                                            |");
		System.out.println("| Bruna Silva - brunas@generation.org                          |");
		System.out.println("| https://github.com/BrunaSilva97/projeto_final_bloco_01.git   |");
		System.out.println("|______________________________________________________________|");
	}

}
