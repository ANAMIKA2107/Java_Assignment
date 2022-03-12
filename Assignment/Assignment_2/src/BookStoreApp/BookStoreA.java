package BookStoreApp;

public class BookStoreA {

	public static void main(String[] args) {
		BookStore bookStore=new BookStore("12th", 5);
		bookStore.sell("Half Girlfriend", 5);
		bookStore.display();
	}
}

