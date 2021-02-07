package Quiz_Lab_Week6;

import java.time.LocalDate;

public class Person {
	String name;
	int bornYear;
	LocalDate date = LocalDate.now();
	public Person(String name,int bornYear) {
		this.name=name;
		this.bornYear=bornYear;
	}public void introduce() {
		System.out.println("My name is "+name);
		System.out.println("I was born in "+bornYear);
	}
}
