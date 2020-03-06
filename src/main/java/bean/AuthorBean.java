package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class AuthorBean {
    private String name;

    @Autowired
    private List<BookBean> bookList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookBean> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookBean> bookList) {
        this.bookList = bookList;
    }

    public void addBook(BookBean bookBean){
        bookList.add(bookBean);
    }

    @Override
    public String toString() {
        return "\nИмя: " + name + '\n' +
                "Написанные книги: " + bookList;
    }
}
