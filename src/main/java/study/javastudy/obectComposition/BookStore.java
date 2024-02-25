package study.javastudy.obectComposition;

public class BookStore {
    public static void main(String[] args) {
        Book book = new Book(123, "Object Oriented Programming with Java", "Ranga");
        book.addReview(new Reviews(10,"Great Book", 5));
        book.addReview(new Reviews(101,"Awesome", 5));
    }
}
