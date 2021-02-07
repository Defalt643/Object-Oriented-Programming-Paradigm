package Lab_Week3;

public class Library {
	private Book[] Book=new Book[50];
	public int searchBook(String wantB) {
		for(int i=0;i<5;i++) {
			if(Book[i].getBookID().equals(wantB) || Book[i].getTitle().equals(wantB)) {
				return i;
			}
		}return -1;
	}public Library(Book[] Book){
		this.Book=Book;
	}public void borrowBook(String wantB) {
		int o = searchBook(wantB);
		if(o != -1) {
			if(Book[o].getStatus() == 'A') {
				System.out.println(wantB+" can borrow.");
				Book[o].updateStatus('U');
			}
			else if(Book[o].getStatus() == 'U') {
				System.out.println(wantB+" is borrowing.");
			}
		}else{
			System.out.println("Sorry, this book cannot found in our library.");
		}	
	}public void returnBook(String wantB) {
		int o = searchBook(wantB);
		if(o != -1) {
			if(Book[o].getStatus() == 'A') {
				System.out.println("This book is not borrowed. Re-input again!!!.");
			}
			else if(Book[o].getStatus() == 'U') {
				System.out.println("Thank you, the return successful.");
			}
		}
	}public void showAllBook() {
		System.out.println("These are all book in our library");
		for(int i=0;i<5;i++) {
			System.out.println(Book[i]);
		}
	}
	
}
