import java.util.*;

/**
 * ex04
 */
public class ex04 {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int day;
        System.out.print("Enter the number that correspond to day of a week: ");
        day = sc.nextInt();
        switch (day) {
            case 1 -> {
                System.out.println("Sunday for Red. Sunday refer to the sun, Sunlight bring bright and strong with seen as red.");
            }
            case 2 -> {
                System.out.println("Monday for Orange. It truly looks like a beautiful moon and bring a peaceful and victory.");
            }
            case 3 -> {
                System.out.println("Tuesday for Purple or Violet. In Khmer, Tuesday translate to Mars, which means hardness and nasty.");
            }
            case 4 -> {
                System.out.println("Wednesday for green of the plant (Blend of green and copper)");
            }
            case 5 -> {
                System.out.println("Thursday for green or yellowish green of the leaves of a banana palm.");
            }
            case 6 -> {
                System.out.println("Friday for Blue");
            }
            case 7 -> {
                System.out.println("Saturday for ripe spine.");
            }
        
            default->{System.out.println("Your input is incorrected !!!!!");}
        }
    }
}