package pessoa;
import pessoa.Funcionario;

public class RepositorioFuncionarioLista implements RepositorioFuncionario{
	private Funcionario nome;
	private RepositorioFuncionarioLista proximo;
	
	RepositorioFuncionarioLista () {
		this.nome=null;
		this.proximo=null;
	}
	
	public void inserir (Funcionario nome) {
		if (this.nome==null) {
			this.nome=nome;
			this.proximo=new RepositorioFuncionarioLista();
		}
		else {
			this.proximo.inserir(nome);
		}
	}
	
	public boolean procurar(Funcionario nome) {
		if (this.nome!=null && this.nome == nome) {
			return true;
		}
		if (this.proximo != null) {
			return this.proximo.procurar(nome);
		} else {
			return false;
		}
	}
	
	public void atualizar(Funcionario atual, Funcionario novo) {
		if (this.nome == atual) {
			this.nome = novo;
		} else {
			this.proximo.atualizar(atual, novo);
		}
	}
	
	public void remover(Funcionario nome){
		if (this.nome!=null && this.nome == nome) {
			this.nome = this.proximo.nome;
			this.proximo = this.proximo.proximo;
		}
		if (this.proximo != null) {
			this.proximo.remover(nome);
		}
	}
}
