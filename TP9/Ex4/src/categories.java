import java.util.ArrayList;

public class categories {

    /**
     * For some odd reasons that I don't know all ISBN store in description
     * and all description store in isbn
     */
    String name, description, isbn;
    int quantity;
    checkISBN check = new checkISBN();
    checkField field = new checkField();

    public categories() {
    }

    public categories(String name, String description, String isbn, int quantity) {
        setName(name);
        setDescription(description);
        setIsbn(isbn);
        setQuantity(quantity);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        field.checkEmptyOrNull(name);
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        field.checkEmptyOrNull(description);
        check.checkLength(description);
        this.description = description;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        field.checkEmptyOrNull(isbn);
        this.isbn = isbn;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    ArrayList<categories> list = new ArrayList<>();

    void addBook(int i, String[] name, String[] isbn, String[] description, int[] quantity) {
        for (int j = 0; j < i; j++) {
            list.add(j, new categories(name[j], isbn[j], description[j], quantity[j]));
        }
    }

    void addBook1(String name, String isbn, String description, int quantity) {
        list.add(0, new categories(name, isbn, description, quantity));
    }

    void removeBook(String title) {
        list.removeIf(categories -> categories.name.equals(title));
    }

    void listAllBook() {
        System.out.println("Name \t\t\t Description \t\t ISBN \t\t\t Quantity\n");
        for (categories cate : list) {
            System.out.printf("%s \t\t %s \t\t %s \t\t %d\n", cate.name, cate.isbn, cate.description, cate.quantity);
        }
    }

    void findBook(String target) {
        for (categories cate : list) {
            if (target.equals(cate.name) || target.equals(cate.description)) {
                System.out.printf("\n%s \t\t %s \t\t %s \t\t %d\n\n", cate.name, cate.isbn, cate.description,
                        cate.quantity);
            }
        }
    }

    void countBook() {
        int count = 0;
        for (categories cate : list) {
            count += cate.quantity;
        }
        System.out.printf("There are %d books\n", count);
    }
}
