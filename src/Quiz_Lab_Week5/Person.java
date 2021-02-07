package Quiz_Lab_Week5;

public class Person {
	String name;
	int age;
	char type;
	public Person() {
		name="unknow";
		age=0;
		type='U';
	}public Person(String name,int age,char type){
		this.name=name;
		this.age=age;
		this.type=type;
	}public String toString() {
		return name+" "+age+" "+type;
	}public String getName() {
		return name;
	}public int getAge() {
		return age;
	}public char getType() {
		return type;
	}
}
