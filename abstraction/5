abstract class LibraryItem {
    private String title;
    private String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

       public abstract void displayInfo();
}
class Book extends LibraryItem {
    public Book(String title, String author) {
        super(title, author);
    }

      public void displayInfo() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor());
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        LibraryItem item = new Book("To Kill a Mockingbird", "Harper Lee");

        item.displayInfo(); // Prints the book's info
    }
}
