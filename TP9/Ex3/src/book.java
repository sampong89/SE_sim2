import java.util.*;

public class book {
    private String title, isbn, author, category, pubDate;// publish date
    private String avalibity, description;
    private static Scanner sc;

    ArrayList<book> list = new ArrayList<>();

    public book() {
    }


    private book(String title, String isbn, String author, String category, String pubDate, String avalibity,
            String description) {
        setAuthor(author);
        setAvalibity(avalibity);
        setCategory(category);
        setDescription(description);
        setIsbn(isbn);
        setPubDate(pubDate);
        setTitle(title);
    }

    public void inputBook() {
        sc = new Scanner(System.in);
        book book = new book();
        System.out.print("Enter the book's title: ");
        book.setTitle(sc.nextLine());
        System.out.print("Enter the book's ISBN: ");
        book.setIsbn(sc.nextLine());
        System.out.print("Enter the book's category: ");
        book.setCategory(sc.nextLine());
        System.out.print("Enter the book's author: ");
        book.setAuthor(sc.nextLine());
        System.out.print("Enter the book's publish date: ");
        book.setPubDate(sc.nextLine());
        System.out.print("Enter the book's avalibity: ");
        book.setAvalibity(sc.nextLine());
        System.out.print("Enter the book's description: ");
        book.setDescription(sc.nextLine());

        book.addBook();

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPubDate() {
        return this.pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getAvalibity() {
        return this.avalibity;
    }

    public void setAvalibity(String avalibity) {
        this.avalibity = avalibity;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    private void addBook() {
        int i = 0;
        list.add(i, new book(title, isbn, category, author, pubDate, avalibity, description));
        i++;
    }

    public void displayInfo() {
        for (book book : list) {
            System.out.printf("%s \t\t %s \t\t %s \t\t %s \t\t %s \t\t %s \t\t %s \n\n", book.title, 
                    book.isbn, book.category, book.author, book.pubDate, book.avalibity, book.description);
        }
    }

    
}
