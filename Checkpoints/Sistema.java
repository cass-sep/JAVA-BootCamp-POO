package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Departamento;
import entidades.Funcionario;
import entidades.enums.Niveis;

public class Sistema {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String depto, func, nivel;
        double salario;

        System.out.print("Insira o departamento: ");
        depto = sc.nextLine();
        System.out.print("Insira o nome do funcionário: ");
        func = sc.nextLine();
        System.out.print("Insira o nível do funcionário: ");
        nivel = sc.nextLine();
        System.out.print("Insira o valor do salário base: ");
        salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(func, salario, Niveis.valueOf(nivel), new Departamento(depto));

        System.out.print("Quantidade de contratos associados: ");
        int c = sc.nextInt();

        for(int i = 1; i <= c; i++){
            System.out.println("Contrato nº"+i+": ");
            System.out.println("Data (dd/mm/yyyy): ");
            Date data = sdf.parse(sc.next());
            System.out.println("Valor da hora: ");
            double valor = sc.nextDouble();
            System.out.println("Quantidade de horas: ");
            int horas = sc.nextInt();

            Contrato contrato = new Contrato(data, valor, horas);
            funcionario.addContrato(contrato);
        }

        System.out.print("Informe mês e ano (mm/aaaa): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Departamento: "+funcionario.getDepartamento());
        System.out.println("Salário de "+mesAno+": R$ "+String.format("%.2f", funcionario.ganho(ano, mes)));

        
        sc.close();
    }
}
