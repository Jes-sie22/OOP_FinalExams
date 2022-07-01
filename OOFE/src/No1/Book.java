package No1;

public class Book {
    // attributes
    private String title;
    private double price;
    private int year;
    private String author;

    private int stock;

    // methods
    // constructor
    public Book(String title, double price, int year, String author, int stock) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
        this.stock = stock;
    }

    // getter and setter

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTitle(){
        return this.title;
    }
    public double getPrice(){
        return this.price;
    }
    public int getYear(){
        return this.year;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
