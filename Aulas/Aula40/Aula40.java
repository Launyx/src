package Aulas.Aula40;

public class Aula40 {
    public static void main(String[] args) {
        
        double price = 400;
        double discount;

        if (price < 200){
            discount = price * 0.1;
        }else{
            discount = 0;
        }

        // Uma variável não iniciada (sem valor) não pode ser usada
        System.out.println(discount);
    }
}
