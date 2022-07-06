package entidades;

public class Veiculo {
    private int passageiros;
    private double capacidade;
    private double consumo;

    public Veiculo(int p, double ca, double co){
        passageiros = p;
        capacidade = ca;
        consumo = co;
    }

    public double tanqueViagem(double quilometro){
        return quilometro/(consumo*capacidade);
    }

    public double dividirDespesas(double quilometro, double combustivel){
        return (quilometro/consumo*combustivel)/passageiros;
    }

    public int getPassageiros(){
        return passageiros;
    }
    public void setPassageiros(int passageiros){
        this.passageiros = passageiros;
    }

    public double getCapacidade(){
        return capacidade;
    }

    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }

    public double getConsumo(){
        return consumo;
    }

    public void setConsumo(double consumo){
        this.consumo = consumo;
    }

    public String toString(){
        return "\nO veículo comporta "+passageiros+" pessoas. Tem uma capacidade de "+capacidade
        +"L de combustível, e faz "+consumo+" quilômetros por litro.\n";
    }

}
