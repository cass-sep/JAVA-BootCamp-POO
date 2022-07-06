package aplicacao;

import java.util.Scanner;

import entidades.Veiculo;

public class ViagemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passageiros;
        double cpTanque, consumo, km, valor;

        System.out.println("\nInforme a quantidade de passageiros: ");
        passageiros = sc.nextInt();
        System.out.println("Informe a capacidade do tanque: ");
        cpTanque = sc.nextDouble();
        System.out.println("Informe o consumo por litro: ");
        consumo = sc.nextDouble();
        System.out.println("Informe a distância em km: ");
        km = sc.nextDouble();
        System.out.println("Informe o valor do combustível: ");
        valor = sc.nextDouble();

        Veiculo gurgel = new Veiculo(passageiros, cpTanque, consumo);

        System.out.println(gurgel.toString());

        double tanques = gurgel.tanqueViagem(km);
        double rateio = gurgel.dividirDespesas(km, valor);

        System.out.printf("Para a viagem precisaremos de %.1f tanque(s) e cada passageiro contribuirá com R$ %.2f\n", tanques, rateio);

        
        sc.close();
    }
}
