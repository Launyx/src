package Aulas.Aula224;

public class Fatura {

    private Double pagamentoBasico;
    private Double taxa;

    public Fatura(){

    }

    public Fatura(Double pagamentoBasico, Double taxa){
        this.pagamentoBasico = pagamentoBasico;
        this.taxa = taxa;
    }

    public void setPagamentoBasico(Double pagamentoBasico){
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getPagamentoBasico(){
        return this.pagamentoBasico;
    }

    public void setTaxa(Double taxa){
        this.taxa = taxa;
    }

    public Double getTaxa(){
        return this.taxa;
    }

    public Double getPagamentoTotal(){
        return getPagamentoBasico() + getTaxa();
    }
}
