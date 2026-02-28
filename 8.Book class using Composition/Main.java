public class Main {
    public static void main(String[] args) {

        Author author = new Author("George Orwell", "orwell@email.com");

        Book book = new Book("1984", author);

        book.addPage("Big Brother is watching you.");
        book.addPage("Freedom is slavery.");
        
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor().getName());
        System.out.println("Email: " + book.getAuthor().getEmail());

        for (Page p : book.getPages()) {
            System.out.println(
                "Page " + p.getPageNumber() + ": " + p.getContent()
            );
        }
    }
}
