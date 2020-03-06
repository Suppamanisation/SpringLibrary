import bean.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("bean");
        context.refresh();
        BookBean bookBean = context.getBean(BookBean.class);
        AuthorBean authorBean = context.getBean(AuthorBean.class);
        LibraryBean libraryBean = context.getBean(LibraryBean.class);

        ListUtil util = new ListUtil();
        util.setLibraryBean(libraryBean);
        util.checkLib();

       System.out.println("1. Добавить книгу\n2. Посмотреть всё\n3. Удалить книгу\n4. Удалить автора\n5. Выход");

        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();

        while (selection<5)
        {
            switch(selection){
                case 1:

                    System.out.println("Введите имя автора");
                    util.addAuthor(context.getBean(AuthorBean.class).setName(input.next()));
                    System.out.println("Введите название книги");
                    bookBean.setName(input.next());
                    System.out.println("Введите год написания");
                    bookBean.setYear(input.nextInt());
                    util.addBook(bookBean);
                    break;

                case 2:
                    util.checkLib();
                    break;

                case 3:
                    System.out.println("Enter amount to be credited");
                    break;
            }
            System.out.println("1. Добавить книгу\n2. Посмотреть всё\n3. Удалить книгу\n4. Удалить автора\n5. Выход");
            selection = input.nextInt();
        }
    }
}
