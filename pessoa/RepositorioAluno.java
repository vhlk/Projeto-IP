import pessoa;

public interface RepositorioAluno {
	public void inserir (Aluno nome);
	
	public boolean procurar(Aluno nome);
	
	public void atualizar(Aluno atual, Aluno novo);
	
	public void remover(Aluno nome);
}
