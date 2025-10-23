package unidad3;

    import java.io.*;
import java.util.List;

public class BookFileHandler {

    public void saveBooks(List<book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("books.txt"))) {
            for (book book : books) {
                writer.write(book.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los libros: " + e.getMessage());
        }
    }

    public void readBooks() {
        try (BufferedReader reader = new BufferedReader(new FileReader("books.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer los libros: " + e.getMessage());
        }
    }
}

    

