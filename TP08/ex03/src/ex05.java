import java.util.Scanner;

// 27 = 3*3*3 and sumdigit 27 = 9 = 3*3
public class ex05 {
    public static int sumdigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        int cube = (int) Math.pow(sumdigit(num), 3);
        int square = num * num;

        if (cube == square) {
            System.out.println("The square of this number is equal to the cube of it's sum digit.");
        } else {
            System.out.println("The square of this number is not equal to the cube of it's sum digit.");
        }
        sc.close();



    }
}
