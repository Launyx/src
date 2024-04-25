package Aulas.Aula224;

public class ServicoBrasileiroTaxa {
    
    public double Taxa(double quantia){
        if(quantia <= 100.00){
            return quantia * 0.2;
        }
        else{
            return quantia * 0.15;
        }
    }
}
