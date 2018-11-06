package dao.impl;

import dao.deleteBookDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Book;


public class deleteBookDaoImpl implements deleteBookDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void deleteBook(int id) {


        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.delete(session.load(Book.class,id));
        tx.commit();
        session.close();



    }

}
