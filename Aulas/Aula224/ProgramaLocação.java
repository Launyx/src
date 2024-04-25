package Aulas.Aula224;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaLocação {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Digite os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String modelo = tec.nextLine();

        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(tec.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(tec.nextLine(), fmt);

        LocaçãoDeCarros lc = new LocaçãoDeCarros(inicio, fim, new Veiculo(modelo));

        System.out.print("Digite o preço por hora: ");
        double preçoHora = Double.parseDouble(tec.nextLine());

        System.out.print("Digite o preço por dia: ");
        double preçoDia = Double.parseDouble(tec.nextLine());

        ServicoAluguel sa = new ServicoAluguel(preçoHora, preçoDia, new ServicoBrasileiroTaxa());

        sa.processoFatura(lc);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + String.format("%.2f", lc.getFatura().getPagamentoBasico()));
        System.out.println("Imposto: " + String.format("%.2f", lc.getFatura().getTaxa()));
        System.out.println("Pagamento total: " + String.format("%.2f", lc.getFatura().getPagamentoTotal()));

        tec.close();
    }
}
