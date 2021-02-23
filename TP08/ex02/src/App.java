import java.util.*;

public class App {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        production p = new production();//call function from other file (production.java)

        System.out.println("~~~~~~~~Enter three float number to see their product:~~~~~~~~");
        System.out.print("Input the first number: ");
        p.num1 = sc.nextFloat();
        System.out.print("Input the second number: ");
        p.num2 = sc.nextFloat();
        System.out.print("Enter the third number: ");
        p.num3 = sc.nextFloat();
        
        p.product();
    }
}
