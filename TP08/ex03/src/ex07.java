import java.util.Scanner;

public class ex07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choise;
        System.out.println("Let's start the game: ");
        System.out.print("""
                Q1. You enter into the first room, here it is a lot of gold. Whether you will take it?
            
                (A. Yes, B. No): """);
        choise = sc.nextLine().charAt(0);
        if (choise == 'B'||choise=='b') {
            System.out.println("Congratulation, you have passed the first test honor!");
            System.out.print("""
                    Q2. You pass in a following room. It is full of diamonds, whether you will take diamonds?

                    (A. Yes, B. No): """);
            choise = sc.nextLine().charAt(0);
            if (choise == 'B' || choise == 'b') {
                System.out.println("Congratulation, you have passed the second test of honor!!!");
                System.out.print("""
                        Q3. (Only if pass Q2) You enter into the third room. A person was attacking by a dragon! To move further,
                        not paying to them of attention?
                        
                        (A. Yes, B. No): """);
                choise = sc.nextLine().charAt(0);
                if (choise == 'B' || choise == 'b') {
                    System.out.println("Congratulation, you have passed the second test of honor!!!\n");
                    System.out.print("Congratulation, you have pass all tests of honor. Princess gets to you!!");
                } else {
                    System.out.println("""
                    You try to pass past, but a dragon notice your presence
                            and transforms you into ashes. You are dead!!! GAME is over!!!
                                    """);
                    System.exit(0);
                }
            } else {
                System.out.println("""
                        Diamonds remain to you, but you have ruined the
                        second test
                        """);
                        System.exit(0);
            }
        } else {
            System.out.println("""
                    Gold remains to you, but you have ruined test. GAME is over!!!
                    """);
            System.exit(0);
        }
        sc.close();
    }
    
}
