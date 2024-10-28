# Implementación de una Biblioteca en Java usando Colecciones

Este proyecto implementa una biblioteca simple en Java, usando la interfaz de colecciones `List` para gestionar una colección de libros. La biblioteca permite agregar, eliminar, buscar y listar libros.

## Estructura de Clases

El proyecto tiene dos clases principales:

1. **Book**: Representa un libro con atributos como `title`, `author`, y `isbn`.
2. **Library**: Gestiona una colección de libros (`List<Book>`) y proporciona métodos para agregar, eliminar, buscar y listar libros en la biblioteca.

### Clase `Book`

La clase `Book` define los atributos de un libro y sobrescribe los métodos `equals` y `hashCode` para que los libros puedan compararse en base al `isbn`. Esto es importante para verificar si un libro ya existe en la biblioteca.

**Código:**

```java
import java.util.Objects;

public class Book {
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

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
