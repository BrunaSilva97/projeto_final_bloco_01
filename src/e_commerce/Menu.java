package e_commerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import site.controller.SiteController;
import site.model.*;

public class Menu {

	public static void main(String[] args) {

		SiteController sites = new SiteController();

		Scanner leia = new Scanner(System.in);

		int opcao, codigo, marca = 0, preco, quantidade;
		String modelo;
		
		System.out.println("\nCriar estoque\n");
		
		Samsung sam1 = new Samsung(sites.gerarNumero(), 1, 2000, "S24", 2);
		sites.cadastrar(sam1);

		Samsung sam2 = new Samsung(sites.gerarNumero(), 1, 1500, "A55", 5);
		sites.cadastrar(sam2);

		Motorola mot1 = new Motorola(sites.gerarNumero(), 2, 900, "G24", 3);
		sites.cadastrar(mot1);

		Motorola mot2 = new Motorola(sites.gerarNumero(), 2,2500, "EDGE 40", 1);
		sites.cadastrar(mot2);

		sites.listarTodas();

		while (true) {

			System.out.println(" _____________________________ ");
			System.out.println("|                             |");
			System.out.println("|      *Celulares e cia.*     |");
			System.out.println("|_____________________________|");
			System.out.println("|                             |");
			System.out.println("|1 - Criar Produto            |");
			System.out.println("|2 - Listar Produtos          |");
			System.out.println("|3 - Buscar Produto por marca |");
			System.out.println("|4 - Atualizar dados          |");
			System.out.println("|5 - Apagar Produto           |");
			System.out.println("|0 - Encerrar                 |");
			System.out.println("|_____________________________|");
			System.out.println("|                             |");
			System.out.println("|  Digite a opção desejada:   |");
			System.out.println("|_____________________________|");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros! ");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 0) {
				System.out.println("\n  *Obrigada por sua visita e volte sempre!* ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\nCriar Produtos: \n");

				System.out.println("Digite o Modelo do aparelho: ");
				modelo = leia.next();
				System.out.println("Digite o preço do aparelho: ");
				leia.skip("\\R?");
				preco = leia.nextInt();

				do {
					System.out.println("Digite a marca do aparelho (1 - Samsung ou 2 Motorola): ");
					marca = leia.nextInt();
				} while (marca < 1 && marca > 2);

				System.out.println("Digite a quantidade de aparelho em estoque: ");
				quantidade = leia.nextInt();

				
				keyPress();
				break;
				
			case 2:
				System.out.println("\nListar Produtos: \n");
				sites.listarTodas();
				keyPress();

				break;
			case 3:
				System.out.println("\nBuscar Produto por marca: \n");
				
				System.out.println("Digite o código do produto: ");
				codigo = leia.nextInt();
				
				sites.procurarPorNumero(codigo);

				keyPress();
				break;
			case 4:
				System.out.println("\nAtualizar dados de um celular: \n");
				
				System.out.println("Digite o código do aparelho: ");
				codigo = leia.nextInt();
				
				var buscaCodigo = sites.buscaNaCollection(codigo);
				
				if(buscaCodigo != null) {
					
					codigo = buscaCodigo.getCodigo();
					
					System.out.println("Digite o Modelo do aparelho: ");
					modelo = leia.next();
					System.out.println("Digite o preço do aparelho: ");
					leia.skip("\\R?");
					preco = leia.nextInt();
					System.out.println("Digite a quantidade de aparelho em estoque: ");
			        quantidade = leia.nextInt();
			        
			        System.out.println("Digite a marca do aparelho (1 - Samsung ou 2 - Motorola): ");
			        marca = leia.nextInt();
			        
			        switch (marca) {
					case 1 -> {
						
						Site siteAtualizado = new Samsung(codigo, marca, preco, modelo, quantidade);
						sites.atualizar(siteAtualizado);

					}
					case 2 -> {
						Site siteAtualizado = new Motorola(codigo, marca, preco, modelo, quantidade);
						sites.atualizar(siteAtualizado);

						

					}
					default -> {
						System.out.println("Marca inválida!");
					}
					}
				} else {
					System.out.println("Aparelho não encontrada!");
				}

				keyPress();
				break;
			case 5:
				System.out.println("\nApagar Produto: \n");
				 
				System.out.println("Digite o código do aparelho: ");
				codigo = leia.nextInt();
				
				sites.deletar(codigo);
				
				keyPress();
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

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}