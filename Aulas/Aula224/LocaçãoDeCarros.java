package Aulas.Aula224;

import java.time.LocalDateTime;

public class LocaçãoDeCarros {
    
    private LocalDateTime inicio;
    private LocalDateTime fim;

    private Veiculo veiculo;
    private Fatura fatura;

    public LocaçãoDeCarros(){
        
    }

    public LocaçãoDeCarros(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo){
        this.inicio = inicio;
        this.fim = fim;
        this.veiculo = veiculo;
    }

    public void setInicio(LocalDateTime inicio){
        this.inicio = inicio;
    }

    public LocalDateTime getInicio(){
        return this.inicio;
    }

    public void setFim(LocalDateTime fim){
        this.fim = fim;
    }

    public LocalDateTime getFim(){
        return this.fim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

}
