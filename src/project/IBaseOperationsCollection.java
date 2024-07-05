package project;

public interface IBaseOperationsCollection <T> {
	public void addPerson (Person person);
	public void removePerson (Person person);
	public int length();
	public T showAllPersons();
	public T searchByName(String name);
	public T searchByAge(int age);
	public void sort();
	public T sortByAge();
}
