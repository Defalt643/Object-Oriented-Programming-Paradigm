package Quiz_Lab_Week10;

import java.time.LocalDate;

public class Person {
	String name,work;
	int bornYear;
	char type;
	LocalDate date = LocalDate.now();
	public Person(String name,int bornYear) {
		this.name=name;
		this.bornYear=bornYear;
	}public void introduce() {
		System.out.println("Name = "+name+" Year = "+bornYear+" Age = "+(date.getYear()-bornYear));
	}public char getType() {
		return type;
	}public String getWork() {
		return work;
	}
}
