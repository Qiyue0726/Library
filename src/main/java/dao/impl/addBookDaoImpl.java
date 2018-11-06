package dao.impl;

import dao.addBookDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import pojo.Book;

public class addBookDaoImpl implements addBookDao {
    private SessionFactory sessionFactory;
    private Book book;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    private PlatformTransactionManager transactionManager;


    @Override
    public void addBook(String bookName, String author, String publishingCompany, int isbn, double price) {
        Session session = sessionFactory.openSession();
        book.setBookName(bookName);
        book.setAuthor(author);
        book.setPublishingCompany(publishingCompany);
        book.setIsbn(isbn);
        book.setPrice(price);
        session.save(book);
        session.close();
    }
}
