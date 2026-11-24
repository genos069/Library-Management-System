package org.example.entity;

public class Books {
    private String id;
    private String title;
    private String author;
    private Integer count;
    private Integer price;

    public Books(){}
    public Books(String title,String author,Integer count,Integer price){
        Books book = new Books();

        book.setAuthor(author);
        book.setCount(count);
        book.setPrice(price);
        book.setCount(count);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
