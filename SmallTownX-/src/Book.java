


public class Book  {

    @Override
	public String toString() {
		return "Book [title=" + title + ", borrowed=" + borrowed + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
		
	}

	String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        title = bookTitle;
        borrowed = false;
    }
   
    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    	borrowed = true;
    }
   
    // Marks the book as not rented
    public void returned() {
        // Implement this method
    	borrowed = false;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
        if (borrowed) {
        	return true;
        }
        return false;
    }
   
    // Returns the title of the book
    public String getTitle() {
        // Implement this method
    	return title;
    	

    	}
    

    

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Rented? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Rented? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Rented? (should be false): " + example.isBorrowed());
    }
} 