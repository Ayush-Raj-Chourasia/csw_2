class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayInfo();
            }
        }
    }
}

public class Question_6 {
    public static void main(String[] args) {
        Library library = new Library(5);

        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\nBooks in the library:");
        library.displayBooks();
    }
}
