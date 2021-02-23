public class ex06 {
    public static void main(String[] args) {
        int start = 100;
        int end = 999;
        for (int i = start; i <= end; i++) {
            int num = i;
            boolean[] check = new boolean[10];
            while (num != 0) {
                if (check[num % 10]) {
                    break;
                }
                check[num % 10] = true;
                num = num / 10;
            }
            if (num == 0)
            System.out.print(i + " ");
        }
    }
}
