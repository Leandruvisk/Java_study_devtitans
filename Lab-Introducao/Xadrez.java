import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            if (i % 2 == 1) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print("*");

                if (j < n - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}