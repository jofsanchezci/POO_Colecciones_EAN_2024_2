import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>(); // Inicializamos la colección como un ArrayList
    }

    // Método para agregar un libro a la biblioteca
    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("The book is already in the library.");
        }
    }

    // Método para eliminar un libro de la biblioteca
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("The book was not found in the library.");
        }
    }

    // Método para buscar libros por título
    public List<Book> findBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    // Método para listar todos los libros en la biblioteca
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
