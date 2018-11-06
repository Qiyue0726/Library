package service.impl;

import dao.deleteBookDao;
import service.deleteBookService;

public class deleteBookServiceImpl implements deleteBookService {

    private deleteBookDao deleteBookDao;

    public dao.deleteBookDao getDeleteBookDao() {
        return deleteBookDao;
    }

    public void setDeleteBookDao(dao.deleteBookDao deleteBookDao) {
        this.deleteBookDao = deleteBookDao;
    }

    @Override
    public void delete(int id) {
        deleteBookDao.deleteBook(id);
    }
}
