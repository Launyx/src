package Aulas.Aula58;

public class FuncoesString {
    public static void main(String[] args) {
        
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();    // Texto em caixa baixa
        String s02 = original.toUpperCase();    // Texto em caixa alta
        String s03 = original.trim();           // Remove espaços adjacentes ao texto
        String s04 = original.substring(2); // pega parte do texto a partir do index informado
        String s05 = original.substring(2, 9);  // pega aprte do texto no intervalo infromado
        String s06 = original.replace('a', 'x');    // substitui um caracter por outro
        String s07 = original.replace("abc", "xy"); // substitui uma string por outra
        int i = original.indexOf("bc"); // Obtem primeira aparição do indice
        int j = original.lastIndexOf("bc"); // Obtem última aparição do indice
        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("last Index of 'bc': " + j);

        for (i = 0; i < vect.length; i++){
            System.out.print(vect[i]);
        }
        
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);






    }
}
