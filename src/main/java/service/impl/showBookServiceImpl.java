package service.impl;

import pojo.Book;
import service.showBookService;

import java.util.List;

public class showBookServiceImpl implements showBookService {

    private dao.showBookDao showBookDao;

    public dao.showBookDao getShowBookDao() {
        return showBookDao;
    }

    public void setShowBookDao(dao.showBookDao showBookDao) {
        this.showBookDao = showBookDao;
    }

    public List<Book> show()
    {
        return showBookDao.select();
    }
}
