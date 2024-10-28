public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        // Agregar libros
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Intentar agregar un libro duplicado
        library.addBook(book1);

        // Listar todos los libros
        library.listBooks();

        // Buscar libros por título
        System.out.println("\nSearching for books titled '1984':");
        for (Book book : library.findBooksByTitle("1984")) {
            System.out.println(book);
        }

        // Eliminar un libro
        library.removeBook(book2);
        library.listBooks();
    }
}
