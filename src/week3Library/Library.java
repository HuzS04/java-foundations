package week3Library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String isbn) throws LibraryException {
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                if(book.getAvailable()){
                    book.borrowBook();
                    return;
                } else {
                    throw new LibraryException("Book is not available");
                }
            }
        }
        throw new LibraryException("Book not found");
    }

    public void returnBook(String isbn) throws LibraryException{
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                book.returnBook();
                return;
            }
        }
        throw new LibraryException("Book not found");
    }

    public List<Book> getAvailableBooks(){
        return books.stream()
                .filter(n -> n.getAvailable())
                .collect(Collectors.toList());
    }
}
