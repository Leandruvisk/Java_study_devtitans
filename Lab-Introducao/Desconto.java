//  Para atrair mais clientes, uma loja de roupas oferece um desconto de 5% em compras de R$200,00 ou mais. Escreva um programa (classe Desconto) 
// que lê o preço sem desconto de uma compra e imprime o valor a ser pago pelo cliente (com duas casas decimais). 
// 
// Exemplo de entrada e saída esperada:

//     Entrada: 320.99
//     Saída: 304.94

// Dica:

//     A classe Scanner, usada para ler dados do teclado, usa as configurações do sistema para setar o formato dos números reais. Dependendo da linguagem 
// do seu sistema, um número real pode usar "." (ponto) ou "," (vírgula).
//     Você pode representar os números reais usando float ou double.
//         Em Java, um número real isolado (e.g., 1.21) é considerado como sendo do tipo double. Para usar um número como sendo do tipo float, 
// use o 'f' ao final do número (e.g., 1.21f).
//         Java converte automaticamente tipos quando não há perda de precisão. Exemplo: double nota = 8.7f; // Converte de float para double automaticamente
//         Entretanto, quando há perda de precisão, isso não é possível e o uso do cast é obrigatório. Exemplo: float nota = (float) 8.7; // Converte de double para float usando o cast
//     Para imprimir algo formatado em Java, use o método System.out.printf(String format, Object... args). Exemplo: System.out.printf("%.3f\n", media);


import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o preço sem desconto do teclado
        double valorCompra = scanner.nextDouble();
        
        // Calcular o valor final com ou sem desconto
        double valorFinal;
        if (valorCompra >= 200.00) {
            double desconto = valorCompra * 0.05; // 5% de desconto
            valorFinal = valorCompra - desconto;
        } else {
            valorFinal = valorCompra;
        }
        
        // Imprimir o resultado com 2 casas decimais
        System.out.printf("%.2f\n", valorFinal);
        
        scanner.close();
    }
}