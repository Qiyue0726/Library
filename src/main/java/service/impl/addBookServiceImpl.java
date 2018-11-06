package service.impl;

import dao.addBookDao;
import service.addBookService;

public class addBookServiceImpl implements addBookService {
    private dao.addBookDao addBookDao;

    public dao.addBookDao getAddBookDao() {
        return addBookDao;
    }

    public void setAddBookDao(dao.addBookDao addBookDao) {
        this.addBookDao = addBookDao;
    }

    public void add(String bookName,String author,String publishingCompany,int isbn,double price){
        addBookDao.addBook(bookName,author,publishingCompany,isbn,price);
    }
}
