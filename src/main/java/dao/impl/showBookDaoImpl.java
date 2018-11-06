package dao.impl;

import dao.showBookDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pojo.Book;

import java.util.List;
public class showBookDaoImpl implements showBookDao {

    List<Book> Books;

    private SessionFactory sessionFactory;

    public List<Book> getBooks() {
        return Books;
    }

    public void setBooks(List<Book> books) {
        Books = books;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Book> select(){

        Session session = sessionFactory.openSession();

        Books = session.createQuery("from Book order by id").list();

        session.close();

        return Books;
    }



}
