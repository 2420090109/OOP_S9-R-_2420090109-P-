package mypack;
// Create a class Book with attributes title, author, and price.
//Use a parameterized constructor to initialize the data and display the book details.

class books{
	String title;
	String author;
	double price;
	books(String title,String author,double price){
	this.title = title;
	this.author = author;
	this.price = price;
	
	}
	void display() {
	System.out.println("Book details: ");
	System.out.println("Title: " + title + ", Author: " + author + ", price: " + price);
}

}
public class Book{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		books b = new books("Lords","Dr.Louis",234.32);
		books b1 = new books("Journey to earth","jules verne",500);
		b.display();
		b1.display();
		

	}

}
