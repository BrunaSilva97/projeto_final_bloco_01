package site.model;

public class Samsung extends Site {

	private String Samsung;

	public Samsung(int codigo, int marca, int preco, String modelo, int quantidade) {
		super(codigo, marca, preco, modelo, quantidade);
		this.Samsung = Samsung;
	}

	public String getSamsung() {
		return Samsung;
	}

	public void setSamsung(String samsung) {
		Samsung = samsung;
	}

	
	public void visualizar() {
		super.visualizar();
	}

}
