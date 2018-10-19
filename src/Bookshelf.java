import java.util.ArrayList;

public class Bookshelf {

    ArrayList<Book> bookList = new ArrayList<>();


    public void add(Book book) {
        bookList.add(book);
    }

    public void remove(Book book) {
        bookList.remove(book.title);
    }


}
