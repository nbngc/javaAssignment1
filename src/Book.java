public class Book {
    String bookName;
    int ISBN;
    String author;
    double price;

    public Book(String bookName, int ISBN, String author, double price){
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
    }
    public String getBookName(){
        return bookName;
    }
    public int getISBN() {
        return ISBN;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice() {
        return price;
    }
    public String displayBook(){
        return ("The book "+this.bookName+" by "+this.author+" with ISBN "+this.ISBN+" costs "+this.price);
    }

    public static void main(String[] args) {
        Book book = new Book("Siddhartha",5868654,"Herman Hesse", 355.55);
        System.out.println(book.displayBook());
    }
}
