package project.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import project.*;

public class ListPerson {

	private List<Person> list;
	
	public ListPerson () {
		list = new ArrayList<>();
	}
	public ListPerson (List<Person> list) {
		this.list = new ArrayList<>(list);
	}
	
	//Operações básicas
	public void addPerson (Person person) {
		list.add(person);
	}
	
	public void removeAllSamePerson (Person person) {
		List<Person> newList = new ArrayList<>();
		newList.add(person);
		list.removeAll(newList);
	}
	
	public int length() {
		return list.size();
	}
	
	public List<Person> showAllPersons() {
		return list;
	}
	
	//Pesquisa
	public List<Person> searchByName(String name){
		if(name.isBlank())
			return new ArrayList<>();
		List<Person> newList = new ArrayList<>();	
		for (Person p : list) {
			if(p.getNome() == name)
				newList.add(p);
		}
		return newList;
	}
	public List<Person> searchByAge(int age){
		if(age < 0)
			return new ArrayList<>();
		List<Person> newList = new ArrayList<>();	
		for (Person p : list) {
			if(p.getIdade() == age)
				newList.add(p);
		}
		return newList;
	}
	
	//Ordenação
	public void sort() {
		Collections.sort(list);
	}
	public List<Person> sortByAge() {
		List<Person> newList = new ArrayList<>(list);
		Collections.sort(newList, new ComparatorAgePerson());
		return newList;
	}
}
