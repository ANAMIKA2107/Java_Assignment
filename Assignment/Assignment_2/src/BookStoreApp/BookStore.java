package BookStoreApp;

public class BookStore {
	private final int SIZE;
	private String bookStoreName;
	private Book[] books;
	
	public BookStore(String bookStoreName, int size) {
		SIZE=size;
		this.bookStoreName = bookStoreName;
		this.books = new Book[SIZE];
		init();
	}
	//populate some books
	private void init() {
			books[0]=new Book("RD SHARMA", "RD", "5465161", 100);
			books[1]=new Book("Iradove", "Ira", "5455155", 200);
			books[2]=new Book("HC Verma Physics", "HC Vermaa", "94545A12", 8);
			books[3]=new Book("oops java", "Balagurusamy", "50545A12", 20);
			books[4]=new Book("Half Girlfriend", "Chetan Bhagat", "14545A12", 10);
	}



	public void sell(String bookTitle, int noOfCopies) {
		boolean found=false;
		for(int i=0;i<SIZE; i++) {
			if(	books[i].getBookTitle().equals(bookTitle)) {
				
				books[i].setNumOfCopies(books[i].getNumOfCopies()-noOfCopies);
				found=true;
			}
		}
		
		if(found)
			System.out.println("book sell is successful");
		else
			System.out.println("book is not found in store");
	}

	public void order(String bookTitle, int noOfCopies) {
		boolean found=false;
		for(int i=0;i<SIZE; i++) {
			if(	books[i].getBookTitle().equals(bookTitle)) {
				books[i].setNumOfCopies(books[i].getNumOfCopies()+noOfCopies);
				found=true;
			}
		}
		if(found)
			System.out.println("book order is successful");
		else
			System.out.println("book order is not successful");
	}

	public void display() {
		System.out.println("Book store ");
		System.out.println(bookStoreName);
		System.out.println("Books details");
		for(Book book: books) {
			book.display();
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
	}
}
