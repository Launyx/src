package Aulas.Aula39;

public class ExpressaoCondicional {
    public static void main(String[] args) {

        double preco = 34.0;
        double desconto = ( preco < 20) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
    }
}
