package action;

import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.Book;
import service.addBookService;

public class addBook extends ActionSupport {

    private String bookName;
    private String author;
    private String publishingCompany;
    private int isbn;
    private double price;

    private addBookService add_book;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public addBookService getAdd_book() {
        return add_book;
    }

    public void setAdd_book(addBookService add_book) {
        this.add_book = add_book;
    }

    public String execute()throws Exception{

        add_book.add(bookName,author,publishingCompany,isbn,price);

        return SUCCESS;
    }
}
