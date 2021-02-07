package Lab_Week3;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String wantB;
		Book bk[] = new Book[5];
		bk[0]=new Book("100","Programming","John");
		bk[1]=new Book("200","Object-Oriented Programming","May");
		bk[2]=new Book("300","Graphic","Mary");
		bk[3]=new Book("400","Statistics","Martin");
		bk[4]=new Book("500","Database","John");
		Library lib = new Library(bk);
		lib.showAllBook();
		System.out.println("<=== Enter the number what do you want to do ===>");
		System.out.println("1. Borrow a book.");
		System.out.println("2. Return a book.");
		System.out.println("3. Search a book.");
		System.out.println("q. Quit the system.");
		System.out.printf("Select = ","\n");
		char input = kb.next().charAt(0);
		while(input!='q') {
			if(input=='1') {
			System.out.printf("Enter [id/title] of book : ","\n");
			wantB=kb.next();
			lib.borrowBook(wantB);
			}	else if(input=='2') {
			System.out.printf("Enter [id/title] of book : ","\n");
			wantB=kb.next();
			lib.returnBook(wantB);
			}else if(input=='3') {
				System.out.printf("Enter [id/title] of book : ","\n");
				wantB=kb.next();
				if(lib.searchBook(wantB)==-1) {
					System.out.println("Sorry, this book cannot found in our library.");
				}else {
					System.out.println(bk[lib.searchBook(wantB)]);
				}
			}else if(input=='q') {
				System.out.println("Thank you.");
			}else {
				System.out.println("input invaild, try again.");
			}
			System.out.printf("Select = ","\n");
			input = kb.next().charAt(0);
			if(input=='q') {
				System.out.println("Thank you.");
			}
		}
	}
}
