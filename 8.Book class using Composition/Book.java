import java.util.ArrayList;

public class Book {
    private String title;
    private Author author;
    private ArrayList<Page> pages;//<----Composition

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.pages = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    //A method to add pages
    public void addPage(String content) {
        int pageNumber = pages.size() + 1;
        pages.add(new Page(pageNumber, content));
    }
}
