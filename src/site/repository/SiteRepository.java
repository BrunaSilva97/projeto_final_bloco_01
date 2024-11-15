package site.repository;

import site.model.*;

public interface SiteRepository {

	public void cadastrar(Site site);
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void atualizar(Site site);
	public void deletar(int numero);
	
}
