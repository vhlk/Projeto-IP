package pessoa;

public class Aluno extends Pessoa{
	private String matricula;
	public String getIdentificacao() {
		return this.matricula;
	}

	public Aluno (String nome,String nascimento,String matricula) {
		super(nome,nascimento);
		this.matricula = matricula;
	}

	public String getMatricula () {
		return this.matricula;
	}

}

