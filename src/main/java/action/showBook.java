package action;

import com.opensymphony.xwork2.Action;
import pojo.Book;
import service.showBookService;

import java.util.List;

public class showBook implements Action {

    private List<Book> Books;

    private showBookService show_book;

    public List<Book> getBooks() {
        return Books;
    }

    public void setBooks(List<Book> books) {
        Books = books;
    }


    public showBookService getShow_book() {
        return show_book;
    }

    public void setShow_book(showBookService show_book) {
        this.show_book = show_book;
    }


    public String execute()throws Exception{

        Books = show_book.show();
        return SUCCESS;

    }
}
