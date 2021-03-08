import java.util.*;

/**
 * book2
 */
public class book2 {

    public static void main(String[] args) {
        categories cate = new categories();
        Scanner sc = new Scanner(System.in);
        String[] name = { "Intro to java", "Mathematics", "Intro to C++" };
        String[] isbn = { "1983527843952", "1780014396242", "1478523690012" };
        String[] description = { "Learn java", "Learn math", "Learn C++" };
        int[] quantity = { 10, 20, 30 };
        cate.addBook(3, name, isbn, description, quantity);
        while (true) {
            System.out.print("""

                    1. Data input to add/remove book(s) in the category
                    2. List all books
                    3. Find books in this category (by ISBN or Title)
                    4. Count books in this category
                    5. Exit the program

                    Enter your option:  """);
            int key = sc.nextInt();
            switch (key) {
            case 1 -> {
                System.out.print("""
                        Do you to add more books or remove some books?
                        1 -> Add more books.
                        2 -> Remove some books.

                        Enter your option: """);
                int key1 = sc.nextInt();
                switch (key1) {
                case 1 -> {
                    System.out.print("How many book do you want to add ?: ");
                    int num = sc.nextInt();// num == number of book that will be add
                    if (num > 1) {
                        for (int i = 0; i < num; i++) {
                            System.out.print("Enter the book's title: ");
                            sc.nextLine();
                            name[i] = sc.nextLine();
                            sc.nextLine();
                            System.out.print("Enter the book's ISBN: ");
                            isbn[i] = sc.nextLine();
                            System.out.print("Enter the book's description: ");
                            description[i] = sc.nextLine();
                            System.out.print("Enter the book's quantity: ");
                            quantity[i] = sc.nextInt();
                        }
                        cate.addBook(num, name, isbn, description, quantity);
                    } else if (num == 1) {
                        System.out.print("Enter the book's title: ");
                        sc.nextLine();
                        String name1 = sc.nextLine();
                        System.out.print("Enter the book's ISBN: ");
                        String isbn1 = sc.nextLine();
                        System.out.print("Enter the book's description: ");
                        String description1 = sc.nextLine();
                        System.out.print("Enter the book's quantity: ");
                        int quantity1 = sc.nextInt();

                        cate.addBook1(name1, isbn1, description1, quantity1);
                    } else {
                        System.err.println("The number must be greater than 0.");
                    }
                }
                case 2 -> {
                    int num, i = 0;
                    System.out.print("Enter the number of book that you want to remove: ");
                    // int num = sc.nextInt();
                    sc.nextLine();
                    // num = Integer.parseInt(sc.nextLine());
                    num = sc.nextInt();
                    while (i < num) {
                        System.out.print("Enter the title that you want to remove: ");
                        sc.nextLine();
                        String title = sc.nextLine();
                        cate.removeBook(title);
                        i++;
                    }
                }
                default -> System.out.println("Your input is invalid !!!!!!!");
                }
            }
            case 2 -> cate.listAllBook();
            case 3 -> {
                System.out.print("Enter the title or ISBN of the book that you search for: ");
                sc.nextLine();
                String target = sc.nextLine();
                cate.findBook(target);
            }
            case 4 -> cate.countBook();
            case 5 -> System.exit(0);
            default -> System.out.print("Your choice is incorrect !!!!");
            }
        }
    }
}