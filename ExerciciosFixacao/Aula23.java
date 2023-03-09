package ExerciciosFixacao;

import java.util.Locale;

public class Aula23 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double tamanho = 53.234567;

        System.out.printf("Produtos:%n%s, custa R$%.2f%n%s, custa R$%.2f%n%n", produto1, preco1, produto2, preco2);
        System.out.printf("Recorde: %d anos de idade, codigo %d e genero: %s%n%n", idade, codigo, genero);
        System.out.printf("Tamanho com oito casas decimais: %.8f%n", tamanho);
        System.out.printf("Arredondamento (três casas decimais): %.3f%n", tamanho);
        Locale.setDefault(Locale.US);
        System.out.printf("Casa decimal estadunidense: %.3f%n", tamanho);


    }
}
