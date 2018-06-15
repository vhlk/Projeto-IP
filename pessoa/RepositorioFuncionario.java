package pessoa;

public interface RepositorioFuncionario {
	public void inserir (Funcionario nome);
	
	public void remover (Funcionario nome);
	
	public void atualizar (Funcionario atual,Funcionario novo);
	
	public boolean procurar (Funcionario nome);
}
