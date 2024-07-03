package project;

import java.util.Scanner;

import project.list.ListPerson;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String oi = scanner.next();
		
		Person pessoa1 = new Person("Peralta", 3);
		var pessoa2 = new Person("Kaiky", 18);
		var pessoa3 = new Person("Almir", 22);
		
		ListPerson list = new ListPerson();
		
		list.addPerson(pessoa1);
		list.addPerson(pessoa3);
		list.addPerson(pessoa2);
		list.addPerson(pessoa2);
		
		System.out.println(list.showAllPersons());
		System.out.println(list.length());
		System.out.println(list.sortByAge());
	}

}
