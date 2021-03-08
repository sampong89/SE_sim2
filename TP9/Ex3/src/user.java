import java.util.Scanner;

public class user {

    public static void main(String[] args) {
        book book = new book();
        Scanner sc = new Scanner(System.in);
        // String[] name = { "Intro to java", "Mathematics", "Intro to C++" };
        // String[] isbn = { "1983527843952", "1780014396242", "1478523690012" };
        // String[] description = { "Learn java", "Learn math", "Learn C++" };

        while (true) {
            System.out.print("""

                    1. Add book.
                    2. Display all information.
                    3. Exit program

                    Enter your option:  """);
            int key = sc.nextInt();
            System.out.println();
            switch (key) {
            case 1 -> book.inputBook();
            case 2 -> book.displayInfo();
            case 3 -> System.exit(0);

            default -> System.out.print("Your input is in correct !!!!!");
            }
        }
    }
}
