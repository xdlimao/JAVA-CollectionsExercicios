package project.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import project.Person;

public class MapPerson {

	private Map<String, Person> map;
	
	public MapPerson () {
		this.map = new HashMap<>();
	}
	
	public MapPerson (Map<String, Person> p) {
		this.map = new HashMap<>(p);
	}
	
	//Operações básicas
	public void addPerson(String id, Person p) {
		map.put(id, p);
	}
	
	public void removePerson(String id) {
		map.remove(id);
	}
	
	public int length() {
		return map.size();
	}
	
	public Map<String, Person> showAllPersons() {
		System.out.println("SetCollection (usando entrySet()): " + map.entrySet());
		return map;
	}
	
	public List<String> showAllPersonsToStringList() {
		List<String> newList = new ArrayList<String>();
		for(Map.Entry<String, Person> p : map.entrySet()) {
			newList.add("Name: '" + p.getValue().getNome() + "' Age: '" + p.getValue().getIdade()+"'");
		}
		return newList;
	}
	//Pesquisa
	public String searchByKey(String key) {
		return map.get(key).toString();
	}
	
	public Person searchByName(String name) {
		for (Map.Entry<String, Person> p : map.entrySet()) {
			if (p.getValue().getNome().equals(name)) {
				return new Person(p.getValue().getNome(), p.getValue().getIdade());
			}
		}
		return null;
	}
	
		//Poderia fazer com lista e vice-versa, o mais correto é set
	public Set<Person> searchByAge(String name) {
		Set<Person> newSet = new HashSet<>();
		for (Map.Entry<String, Person> p : map.entrySet()) {
			if (p.getValue().getNome().equals(name)) {
				newSet.add(p.getValue());
			}
		}
		return newSet;
	}
	
	public List<Person> searchByAge(int age) {
		List<Person> newSet = new ArrayList<>();
		for (Map.Entry<String, Person> p : map.entrySet()) {
			if (p.getValue().getIdade() == age) {
				newSet.add(p.getValue());
			}
		}
		return newSet;
	}
	
	//Ordenação
	public void sort() {
		Map<String, Person> newMap = new TreeMap<>(map); //TreeMap é uma estrutura que já organiza pra gente
		//Lembrando que as chaves tipo LocalDateTime, String e Integer (e todos que você implementar comparable), já sabem como se organizar ao passar o TreeMap.
		System.out.println(newMap);
	}
	
	
}
