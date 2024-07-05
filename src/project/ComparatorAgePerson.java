package project;

import java.util.Comparator;

public class ComparatorAgePerson implements Comparator<Person> {

	public ComparatorAgePerson(){}
	
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}
	
	
}
