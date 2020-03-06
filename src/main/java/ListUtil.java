import bean.AuthorBean;
import bean.BookBean;
import bean.LibraryBean;

import java.util.List;

public class ListUtil {
    BookBean bookBean;
    AuthorBean authorBean;
    LibraryBean libraryBean;

    public void setBookBean(BookBean bookBean) {
        this.bookBean = bookBean;
    }

    public void setAuthorBean(AuthorBean authorBean) {
        this.authorBean = authorBean;
    }

    public void setLibraryBean(LibraryBean libraryBean) {
        this.libraryBean = libraryBean;
    }

    public void addAuthor(AuthorBean authorBean) {
        libraryBean.addAuthor(authorBean);
    }

    public void addBook(BookBean bookBean) {
        authorBean.addBook(bookBean);
    }
    public void deleteBook(BookBean bookBean, AuthorBean authorBean,LibraryBean libraryBean, String name) {
        bookBean.setName(name);
        List<AuthorBean> list = libraryBean.getAuthorList();
        List<BookBean> list1 = authorBean.getBookList();
        list1.removeIf(bookBean1 -> (bookBean1.equals(bookBean)));
    }
    public void checkLib(){
        System.out.println(libraryBean.toString());
    }
}
