

import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.printf("Enter number of person : ","\n");
		int x = kb.nextInt();
		int person=0;
		Employee[] em =new Employee[x];
		for(int i=0;i<x;i++) {
			System.out.println("Enter information of person ("+(i+1)+") : ");
			System.out.printf("Enter type of person : ","\n");
			int type =kb.nextInt();
			if(type==1) {
				int count=1;
				System.out.printf("Enter employee information ("+count+") [name salary] : ","\n");
				em[i]=new Employee(kb.next(),kb.nextDouble());
				count++;
			}else if(type == 2) {
				int count=1;
				System.out.printf("Enter sales information ("+count+") [name salary commission] : ","\n");
				em[i]=new Sales(kb.next(),kb.nextDouble(),kb.nextDouble());
				count++;
			}else if(type == 3) {
				int count=1;
				System.out.printf("Enter manager information ("+count+") [name salary parkNo] : ","\n");
				em[i]=new Manager(kb.next(),kb.nextDouble(),kb.next());
				count++;
			}else if(type == 4) {
				int count=1;
				System.out.printf("Enter programmer information ("+count+") [name salary OT] : ","\n");
				String y = kb.next();double z =kb.nextDouble();int o =kb.nextInt();
				System.out.printf("Enter number of programming language : ","\n");
				int k=kb.nextInt();
				em[i]=new Programmer(y,z,o,k);
				String[] lang=new String[k]; 
				for(int s=0;s<k;s++) {
					System.out.printf("Enter name of lang ("+(s+1)+") : ","\n");
					lang[s]=kb.next();
				}em[i].addSkill(lang);
			}
		}System.out.println("<== The detail of each person ==>");
		for(int i=0;i<x;i++) {
			System.out.println(em[i]);
		}
	}
}
