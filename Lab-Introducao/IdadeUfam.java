import java.util.Scanner;

public class IdadeUfam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int anoFundacao = 1909;
        
        System.out.print("");

        int anoAtual = scanner.nextInt();
        int idadeUfam = anoAtual - anoFundacao;

        System.out.println("A UFAM tem " + idadeUfam + " anos de fundacao");

        scanner.close();
    }
}
