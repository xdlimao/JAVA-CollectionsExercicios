package project;

import java.util.Objects;

public class Person implements Comparable<Person> {
	private String nome;
	private int idade;
	
	public Person(String nome, int idade){
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
	
	//toString para listar os nomes no console, ao invez da memória
	@Override
	public String toString() {
		return "Person [nome=" + nome + ", idade=" + idade + "]";
	}
	
	//hashCode para o Collection Set
	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	//equals para comparar objetos entre si
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return idade == other.idade && Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Person o) {
		return nome.compareTo(o.getNome());
	}
	
}


