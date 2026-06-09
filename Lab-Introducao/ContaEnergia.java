import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double consumo = scan.nextDouble();
        char tipo = scan.next().charAt(0);

        double preco = -1;

        if (consumo < 0) {
            preco = -1;
        }
        else if (tipo == 'R') {
            if (consumo <= 500)
                preco = consumo * 0.40;
            else
                preco = consumo * 0.65;
        }
        else if (tipo == 'C') {
            if (consumo <= 1000)
                preco = consumo * 0.55;
            else
                preco = consumo * 0.60;
        }
        else if (tipo == 'I') {
            if (consumo <= 5000)
                preco = consumo * 0.55;
            else
                preco = consumo * 0.60;
        }
        else {
            preco = -1;
        }

        System.out.printf("%.2f%n", preco);

        scan.close();
    }
}