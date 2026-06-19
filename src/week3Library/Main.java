package week3Library;

public class Main {
    public static void main(String[] args) throws LibraryException {
        Library library = new Library();
        Book book1 = new Book("Harry Potter", "JK Rowling", "902-2-352-12432-5");
        Book book2 = new Book("Matilda", "Roald Dahl", "142-3-154-23515-3");
        Book book3 = new Book("A Christmas Carol ", "Charles Dickens", "346-1-532-16573-4");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println(library.getAvailableBooks());

        try {
            library.borrowBook("902-2-352-12432-5");
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(library.getAvailableBooks());

        try {
            library.borrowBook("923-13");
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            library.borrowBook("902-2-352-12432-5");
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            library.returnBook("902-2-352-12432-5");
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(library.getAvailableBooks());

    }
}
