package pessoa;
import pessoa.Aluno;

public class RepositorioAlunoLista implements RepositorioAluno{
	private Aluno nome;
	private RepositorioAlunoLista proximo;
	
	RepositorioAlunoLista () {
		this.nome=null;
		this.proximo=null;
	}
	
	public void inserir (Aluno nome) {
		if (this.nome==null) {
			this.nome=nome;
			this.proximo=new RepositorioAlunoLista();
		}
		else {
			this.proximo.inserir(nome);
		}
	}
	
	public boolean procurar(Aluno nome) {
		if (this.nome!=null && this.nome == nome) {
			return true;
		}
		if (this.proximo != null) {
			return this.proximo.procurar(nome);
		} else {
			return false;
		}
	}
	
	public void atualizar(Aluno atual, Aluno novo) {
		if (this.nome == atual) {
			this.nome = novo;
		} else {
			this.proximo.atualizar(atual, novo);
		}
	}
	
	public void remover(Aluno nome){
		if (this.nome!=null && this.nome == nome) {
			this.nome = this.proximo.nome;
			this.proximo = this.proximo.proximo;
		}
		if (this.proximo != null) {
			this.proximo.remover(nome);
		}
	}
	
	
}
