import java.util.*;

public class ex03 {
    private static Scanner sc;

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        double cost;
        double discount = 0;
        System.out.println("Enter the total cost: ");
        cost = sc.nextDouble();

        if (cost >= 10 && cost < 50) {
            discount = 2;
        }else if (cost >= 50 && cost < 100) {
            discount = cost * 0.03;
        } else if (cost >= 100 && cost < 200) {
            discount = cost * 0.07;
        } else if (cost >= 200 && cost < 500) {
            discount = cost * 0.12;
        } else if (cost > 500) {
            discount = cost * 0.25;
        }
        double price = cost - discount;
        System.out.printf("\nThe customer can pay %.3f dollar.", price);
    }
}
