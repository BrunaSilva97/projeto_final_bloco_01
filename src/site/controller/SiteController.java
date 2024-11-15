package site.controller;

import java.util.ArrayList;

import site.model.Site;
import site.repository.*;

public class SiteController implements SiteRepository {

	private ArrayList<Site> listaSites = new ArrayList<Site>();
	int numero = 0;

	@Override
	public void cadastrar(Site site) {
		listaSites.add(site);
		System.out.println("\n O aparelho " + site.getCodigo() + " foi cadastrado com sucesso");
	}

	@Override
	public void procurarPorNumero(int codigo) {
		var marca = buscaNaCollection(codigo);
		if (marca != null) {
			marca.visualizar();
		} else {
			System.out.println("\nO aparelho de código: " + codigo + " não foi encontrado.");
		}
	}

	@Override
	public void listarTodas() {
		for (var site : listaSites) {
			site.visualizar();
		}

	}

	@Override
	public void atualizar(Site site) {
		var buscaCodigo = buscaNaCollection(site.getCodigo());

		if (buscaCodigo != null) {
			listaSites.set(listaSites.indexOf(buscaCodigo), site);
			System.out.println("\nO Aparelho: " + site.getCodigo() + " foi atualizado com secesso!");
		} else {
			System.out.println("\nO aparelho" + site.getCodigo() + " não foi encontrado.");
		}

	}

	@Override
	public void deletar(int numero) {
		var codigo = buscaNaCollection(numero);

		if (codigo != null) {
			if (listaSites.remove(codigo) == true) {
				System.out.println("\nO aparelho " + numero + " foi retirado com sucesso.");
			} else {
				System.out.println("\nO aparelho: " + numero + " não foi encontrado.");
			}

		}

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Site buscaNaCollection(int codigo) {
		for (var marca : listaSites) {
			if (marca.getCodigo() == codigo) {
				return marca;
			}
		}
		return null;

	}
}
