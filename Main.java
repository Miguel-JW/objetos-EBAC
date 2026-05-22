import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos carros deseja cadastrar? (máximo 50): ");
        int quantidade = scanner.nextInt();

        // Garante o máximo de 50
        if (quantidade > 50) {
            System.out.println("Máximo permitido é 50! Ajustando para 50.");
            quantidade = 50;
        }

        Carro[] carros = new Carro[quantidade];

        // Cadastra cada carro
        for (int i = 0; i < quantidade; i++) {
            scanner.nextLine();
            System.out.println("\n--- Carro " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Ano: ");
            int ano = scanner.nextInt();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            carros[i] = new Carro(nome, marca, ano, preco);
        }

        // Exibe os resultados
        System.out.println("\n===== Carros Cadastrados =====");
        double somaPrecos = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("- " + carros[i].nome);
            somaPrecos += carros[i].preco;
        }

        System.out.println("\nQuantidade de carros: " + quantidade);
        System.out.println("Soma total dos preços: R$ " + somaPrecos);

        scanner.close();
    }
}
