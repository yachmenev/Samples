package examples;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;

public class MyComparator {
	static class Person {
		String name;
	    String surname;
	    int age;

	    public Person(String name, String surname, int age) {
	    	this.name = name;
	        this.surname = surname;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	    	return name + " \t" + surname + " \t" + age;
	    }
	}
	static Comparator<Person> compareSurname = new Comparator<Person>() {
		public int compare(Person o1, Person o2) {
			return o1.surname.compareTo(o2.surname);
	    }
	};
	static Comparator<Person> compareAge = new Comparator<Person>() {
		public int compare(Person o1, Person o2) {
			Integer i1 = o1.age;
			Integer i2 = o2.age;
			return i1.compareTo(i2);
	    }
	};

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
	    personList.add(new Person("Bob", "Bober", 19));
	    personList.add(new Person("Zob", "Zober", 34));
	    personList.add(new Person("Ab", "Aber", 25));
	    
	    System.out.println("Sort by Surname: ");
	    Collections.sort(personList, compareSurname);

	    for (Person person : personList) {
	    	System.out.println(person);
	    }
	    System.out.println("\nSort by Age: ");
	    Collections.sort(personList, compareAge);
	    
	    for (Person person : personList) {
	    	System.out.println(person);
	    }
	}
}
