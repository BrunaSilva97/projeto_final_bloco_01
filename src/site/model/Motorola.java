package site.model;

public class Motorola extends Site {
	
	private String Motorola;

	public Motorola(int codigo, int marca, int preco, String modelo, float quantidade) {
		super(codigo, marca, preco, modelo, quantidade);
		this.Motorola = Motorola;

	}
	public String getSamsung() {
		return Motorola;
	}

	public void setSamsung(String samsung) {
		Motorola = samsung;
	}

		public void visualizar() {
		super.visualizar();
		System.out.println("Marca: " + this.Motorola);
	}

}