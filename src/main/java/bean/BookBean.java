package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Scope("prototype")
public class BookBean {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookBean bookBean = (BookBean) o;
        return name.equals(bookBean.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Название: " + name +
                " Год: " + year;

    }
}
