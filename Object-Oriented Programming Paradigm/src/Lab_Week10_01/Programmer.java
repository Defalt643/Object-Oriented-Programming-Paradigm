package Lab_Week10_01;
public class Programmer extends Employee{
	int x=0;
	int OT;
	public Programmer() {
		super.name="unknow";
		super.salary=0;
		this.OT=0;
		this.x=0;
	}public Programmer(String name,double salary,int OT,int x){
		super.name=name;
		super.salary=salary;
		this.OT=OT;
		this.x=x;
	}public void addSkill(String[] progSkill) {
		this.progSkill=progSkill;
	}public double calSalary() {
		return super.salary+OT;
	}
	String[] progSkill=new String[x];
	public String toString() {
		if(progSkill.length==2) {
			return "My name is "+super.name+". I am a programmer.\nMy salary is "+calSalary()+"\nMy programming skill are "+progSkill[0]+", "+progSkill[1];
		}else {
			return "My name is "+super.name+". I am a programmer.\nMy salary is "+calSalary()+"\nMy programming skill are "+progSkill[0]+", "+progSkill[1]+", "+progSkill[2];
		}
	}	
}
