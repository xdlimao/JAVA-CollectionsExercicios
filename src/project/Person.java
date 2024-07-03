package project;

public class Person implements Comparable<Person> {
	private String nome;
	private int idade;
	
	Person(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Person [nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Person o) {
		return nome.compareTo(o.getNome());
	}
	
}


