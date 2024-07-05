package project;

import project.map.MapPerson;

public class Main {

	public static void main(String[] args) {
		var map = new MapPerson();
		var person = new Person("a", 1);
		var person2 = new Person("beas", 2);
		var person3 = new Person("a", 3);

		map.addPerson("A",person);
		map.addPerson("C",person3);
		map.addPerson("B",person2);
		System.out.println(map.showAllPersonsToStringList());
	}

}
