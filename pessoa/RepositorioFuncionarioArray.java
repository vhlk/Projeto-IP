package pessoa;
import pessoa.Funcionario;

public class RepositorioFuncionarioArray implements RepositorioFuncionario{
	private Funcionario[] array;
	private int contador;
	
	RepositorioFuncionarioArray() {
		this.array = new Funcionario[150];
		this.contador = 0;
	}
	
	public void inserir (Funcionario nome) {
		if (contador == array.lenght) {
			Funcionario[] novaArray = new Funcionario[contador * 2];
			for (int i=0;i < contador; i++) {
				novaArray[i] = array[i];
			}
			this.array = novaArray;
		}
		this.array = nome;
		contador++;
	}

	public void remover (Funcionario nome) {
		for (int i=0;i<array.lenght;i++) {
			if(this.array[i] == nome) {
				for (int j=i;j<array.lenght;j++) {
					this.array[i]=this.array[i+1];
				}
			}
		}
	}

	public void atualizar (Funcionario atual,Funcionario novo) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == atual) {
				array[i] = novo;
			}
		}
	}

	public boolean procurar (Funcionario nome) {
		for (int i=0;i<array.lenght;i++) {
			if (this.array[i] == nome) {
				return true;
			}
		}
		else return false;
	}
}
