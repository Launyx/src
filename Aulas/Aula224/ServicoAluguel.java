package Aulas.Aula224;

import java.time.Duration;

import Aulas.Aula224.LocaçãoDeCarros;

public class ServicoAluguel {
    
    private Double precoPorHora;
    private Double precoPorDia;

    private ServicoBrasileiroTaxa servicoTaxa;

    public ServicoAluguel(Double precoPorHora, Double precoPorDia, ServicoBrasileiroTaxa servicoTaxa) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.servicoTaxa = servicoTaxa;
    }

    public void processoFatura(LocaçãoDeCarros locaçãoDeCarros){

        double minutes = Duration.between(locaçãoDeCarros.getInicio(), locaçãoDeCarros.getFim()).toMinutes();
        double hours = minutes / 60;

        double pagamentoBasico;
        if (hours <= 12.0){
            pagamentoBasico = precoPorHora * Math.ceil(hours);

        }else{
            pagamentoBasico = precoPorDia * Math.ceil(hours/ 24.0);

        }

        double taxa = servicoTaxa.Taxa(pagamentoBasico);

        locaçãoDeCarros.setFatura(new Fatura(pagamentoBasico, taxa));

    }
}
