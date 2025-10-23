package unidad3;

public class book{
   
    private String title;
    private String author;
    private double price;

    public book(String string, String string2, double d) {
        
    }

    public void Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + ", " + author + ", " + price;
    }   
}