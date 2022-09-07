package com.demo.booksys.domain;

public class Book {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String book_name;
    private String author;
    private String description;
    private String location;

    private String publish_time;
    private String publisher;
    private String status;
    private String book_type;
    private String image;

    public Book(String id, String book_name, String author, String description, String location, String publish_time, String publisher, String status, String book_type, String image) {
        this.id = id;
        this.book_name = book_name;
        this.author = author;
        this.description = description;
        this.location = location;
        this.publish_time = publish_time;
        this.publisher = publisher;
        this.status = status;
        this.book_type = book_type;
        this.image = image;
    }




}








