import java.util.Scanner;
import java.util.ArrayList;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<PhoneNumber> Phone=new ArrayList<PhoneNumber>();
		System.out.println("This program run until you key Q");
		for(int i=0;;i++) {
			System.out.printf("Insert what do you want : ","\n");
			String state=kb.next();
			if(state.equals("Q")) {
				break;
			}else {
				if(state.equals("add")) {
					Phone.add(i,new PhoneNumber(kb.next(),kb.next()));
					for(int a=0;a<Phone.size();a++) {
						if(Phone.size()==1) {
							System.out.printf("["+Phone.get(a).toString()+"]");
						}else {
							if(a==0) {
								System.out.printf("["+Phone.get(a).toString()+", ");
							}else if(a==Phone.size()-1) {
								System.out.printf(Phone.get(a).toString()+"]");
							}else {
								System.out.printf(Phone.get(a).toString()+", ");
							}
						}
					}System.out.println();
				}else if(state.equals("search")) {
					String name = kb.next();
					for(int o=0;o<Phone.size();o++) {
						if(name.equals(Phone.get(o).getName())) {
							System.out.println(Phone.get(o).toString());
							break;
						}else if(o==Phone.size()-1) {
							System.out.println("Not Found");
						}
					}
				}else if(state.equals("delete")) {
					String name = kb.next();
					for(int o=0;o<Phone.size();o++) {
						if(name.equals(Phone.get(o).getName())) {
							System.out.printf("Do you confirm to delete this item? (Y/N) : ","\n");
							if(kb.next().equals("Y")) {
								Phone.remove(o);
								for(int a=0;a<Phone.size();a++) {
									if(Phone.size()==1) {
										System.out.printf("["+Phone.get(a).toString()+"]");
									}else {
										if(a==0) {
											System.out.printf("["+Phone.get(a).toString()+", ");
										}else if(a==Phone.size()-1) {
											System.out.printf(Phone.get(a).toString()+"]");
										}else {
											System.out.printf(Phone.get(a).toString()+", ");
										}
									}
								}System.out.println();
								break;
							}else {
								for(int a=0;a<Phone.size();a++) {
									if(Phone.size()==1) {
										System.out.printf("["+Phone.get(a).toString()+"]");
									}else {
										if(a==0) {
											System.out.printf("["+Phone.get(a).toString()+", ");
										}else if(a==Phone.size()-1) {
											System.out.printf(Phone.get(a).toString()+"]");
										}else {
											System.out.printf(Phone.get(a).toString()+", ");
										}
									}
								}System.out.println();
								break;
							}
						}else if(o==Phone.size()-1) {
							System.out.println("Not Found");
							break;
						}
					}
				}
			}
		}

	}

}
