public class Pratos{
	private String nome;
	private double preco;
	
	public Pratos(String nomeP, double precoP) {
		this.nome = nomeP;
		this.preco = precoP;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void atualizarPreco(double preco) {
		this.preco = preco;
	}
	
	
}