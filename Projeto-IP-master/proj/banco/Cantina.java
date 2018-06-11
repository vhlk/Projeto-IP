
public class Cantina {
	private String nome;
	private String[] pratos;
	private double[] precos;
	private Pessoa[] funcionarios;
	
	
	
	public Cantina(String nomeT, String[] prT[], double[] prC, Pessoa[] psS) {
		this.nome = nomeT;
		this.pratos = prT;
		this.precos = prC;
		this.funcionarios = psS;
	}



	public String getNome() {
		return this.nome;
	}



	public String[] getPratos() {
		return this.pratos;
	}



	public double[] getPrecos() {
		return this.precos;
	}



	public Pessoa[] getFuncionarios() {
		return funcionarios;
	}
	
}


