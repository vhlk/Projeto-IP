package pessoa;
import pessoa.Aluno;

public class RepositorioAlunoArray implements RepositorioAluno{
	private Aluno[] array;
	private int contador;

	RepositorioAlunoArray() {
		this.array = new Aluno[150];
		this.contador = 0;
	}

	public void inserir (Aluno nome) {
		if (contador == array.lenght) {
			Aluno[] novaArray = new Aluno[contador * 2];
			for (int i=0;i < contador; i++) {
				novaArray[i] = array[i];
			}
			this.array = novaArray;
		}
		this.array = nome;
		contador++;
	}

	public void remover (Aluno nome) {
		for (int i=0;i<array.lenght;i++) {
			if(this.array[i] == nome) {
				for (int j=i;j<array.lenght;j++) {
					this.array[i]=this.array[i+1];
				}
			}
		}
	}

	public void atualizar (Aluno atual, Aluno novo) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == atual) {
				array[i] = novo;
			}
		}
	}

	public boolean procurar (Aluno nome) {
		for (int i=0;i<array.lenght;i++) {
			if (this.array[i] == nome) {
				return true;
			}
		}
		else return false;
	}


}
