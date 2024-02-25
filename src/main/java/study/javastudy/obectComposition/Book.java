package study.javastudy.obectComposition;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;
    private ArrayList<Reviews> reviews = new ArrayList<>();


    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Reviews reviews){
        this.reviews.add(reviews);
    }

}
