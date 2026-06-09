import java.util.ArrayList;
import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> respostas = new ArrayList<>();
        ArrayList<Integer> gabarito = new ArrayList<>();

        int valor;

        // Ler respostas
        while ((valor = scan.nextInt()) != -1) {
            respostas.add(valor);
        }

        // Ler gabarito
        while ((valor = scan.nextInt()) != -1) {
            gabarito.add(valor);
        }

        int acertos = 0;

        for (int i = 0; i < respostas.size(); i++) {
            if (respostas.get(i).equals(gabarito.get(i))) {
                acertos++;
            }
        }

        double porcentagem = (double) acertos * 100 / respostas.size();

        System.out.printf("%.2f%n", porcentagem);

        scan.close();
    }
}