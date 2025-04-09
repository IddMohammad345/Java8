package Association;

import java.util.ArrayList;
import java.util.List;

public class Composition {
    public static void main(String[] args) {
        Library library=new Library("City Library");
        library.addBook(new Book("Java Programing"));
        library.addBook(new Book("Data Structures"));

        System.out.println("Books in "+ library.getBooks() +" : ");
        for (Book book: library.getBooks()){
            System.out.println(book.getBookName());
        }
    }
}
class Book{
    private String bookName;
    public Book(String bookName){
        this.bookName=bookName;
    }
    public String getBookName(){
        return bookName;
    }
}
class Library{
    private String libraryName;
    private List<Book> books=new ArrayList<>();
    public Library(String name){
        this.libraryName=name;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public List<Book>getBooks(){
        return books;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Library "+libraryName + " and its books are being destroyed. ");
        super.finalize();
    }
}