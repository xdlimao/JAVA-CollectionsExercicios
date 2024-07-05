package project.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import project.*;

public class SetPerson implements IBaseOperationsCollection<Set<Person>>{

	private Set<Person> set;
	
	public SetPerson () {
		this.set = new HashSet<>();
	}
	public SetPerson(Set<Person> set) {
		this.set = new HashSet<>(set);
	}
	
	//Operações básicas
	public void addPerson(Person p) {
		set.add(p);
	}
	
	public void removePerson(Person p) {
		set.remove(p);
	}
	
	public int length() {
		return set.size();
	}

	public Set<Person> showAllPersons() {
		return set;
	}
	
	//Pesquisa
	public Set<Person> searchByName(String name) {
		Set<Person> newSet = new HashSet<>();
		for (Person p : set) {
			if (p.getNome().equals(name))
				newSet.add(p);
		}
		return newSet;
	}
	
	public Set<Person> searchByAge(int age) {
		Set<Person> newSet = new HashSet<>();
		for (Person p : set) {
			if (p.getIdade() == age)
				newSet.add(p);
		}
		return newSet;
	}

	//Ordenação
	public void sort() {
		//Comparable não funciona no HashSet e LinkedHashSet, porém, no TreeSet é outra história
		Set<Person> newSet = new TreeSet<>(set); //TreeSet já ordena sozinho
		System.out.println(newSet); //como eu não se genéric aceita void, eu fiz Sout mesmo xd
	}
	
	public Set<Person> sortByAge() {
		Set<Person> newSet = new TreeSet<>(new ComparatorAgePerson()); //TreeSet já ordena sozinho
		newSet.addAll(set);
		return newSet;
	}
}
