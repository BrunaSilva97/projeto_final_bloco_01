package site.model;

public abstract class Site {

	private int codigo;
	private int marca;
	private int preco;
	private String modelo;
	private float quantidade;
	
	public Site(int codigo, int marca, int preco, String modelo, float quantidade) {
		this.codigo = codigo;
		this.marca = marca;
		this.preco = preco;
		this.modelo = modelo;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
		
	public void visualizar() {

		String marca = "";
		
		switch(this.marca) {
		case 1:
			marca = "Samsung";
		break;
		case 2:
			marca = "Motorola";
		break;
		}
		
		System.out.println("\n\n ______________________________________ ");
		System.out.println("|  Dados do aparelho:                  |");
		System.out.println(" ______________________________________ ");
		System.out.println("|  Código: " + this.codigo + "         |");
		System.out.println("|  Modelo: " + this.modelo + "         |");
		System.out.println("|  Marca: " + marca + "                |");
		System.out.println("|  Preço: " + this.preco + "           |");
		System.out.println("|  Quantidade: " + this.quantidade + " |");
		System.out.println("|______________________________________|");

	}
  
}
}
