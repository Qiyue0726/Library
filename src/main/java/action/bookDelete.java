package action;

import com.opensymphony.xwork2.ActionSupport;
import service.deleteBookService;

public class bookDelete extends ActionSupport {

    private int id;

    private service.deleteBookService delete_book;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public deleteBookService getDelete_book() {
        return delete_book;
    }

    public void setDelete_book(deleteBookService delete_book) {
        this.delete_book = delete_book;
    }

    public String execute() throws Exception{


        delete_book.delete(id);

        return SUCCESS;

    }
}
