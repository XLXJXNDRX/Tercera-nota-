package unidad3;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<book> books = new ArrayList<>();
        books.add(new book("El Quijote", "Miguel de Cervantes", 15.5));
        books.add(new book("1984", "George Orwell", 12.3));
        books.add(new book("Cien años de soledad", "Gabriel García Márquez", 20.0));

        BookFileHandler handler = new BookFileHandler();
        handler.saveBooks(books);
        handler.readBooks();
    }
}
