package Lab_Week3;

public class Book {
	private String bookID,title,author,Status;
	private char status;
	public Book(String bookID,String title,String author) {
		this.title=title;
		this.author=author;
		this.bookID=bookID;
		this.status='A';
		if(status=='A') {
			Status="Available";
		}else {
			Status="Unavailable";
		}
	}public String getBookID() {
		return bookID;
	}public char getStatus() {
		return status;
	}public String getTitle() {
		return title;
	}public void updateStatus(char a) {
		if(a=='U') {
			Status="Unavailable";
			status='U';
		}else {
			Status="Available";
			status='A';
		}
	}public String checkStatus() {
		if(status=='A') {
			return "Available";
		}else {
			return "Unavailable";
		}
	}public String toString() {
		return "ID :"+bookID+" Title : "+title+" Author : "+author+" Status : "+Status;
	}
}