package com.ssdi.bookshare.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column (name ="author")
    private String author;
    @Column (name ="price")
    private Double price;
    @Column (name="is_listed")
    private Boolean isListed;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public Book() {
    }

//    public Book(int id, String title, String author, Double price, Boolean isListed) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        this.price = price;
//        this.isListed = isListed;
//    }

        public Book(String title, String author, Double price, Boolean isListed) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isListed = isListed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getListed() {
        return isListed;
    }

    public void setListed(Boolean listed) {
        isListed = listed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", isListed=" + isListed +
                '}';
    }
}
