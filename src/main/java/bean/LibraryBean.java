package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibraryBean {

    @Autowired
    List<AuthorBean> authorList;

    public List<AuthorBean> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<AuthorBean> authorList) {
        this.authorList = authorList;
    }
    public void addAuthor(AuthorBean authorBean) {
        authorList.add(authorBean);
    }

    @Override
    public String toString() {
        return "Список книг: \n" + authorList;
    }
}
