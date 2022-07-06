package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.Niveis;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private Niveis nivel;
    private Departamento departamento;
    private List<Contrato> contratos = new ArrayList<>();

    public Funcionario() {

    }

    public Funcionario(String nome, double salarioBase, Niveis nivel, Departamento departamento) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Niveis getNivel() {
        return nivel;
    }

    public void setNivel(Niveis nivel) {
        this.nivel = nivel;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    // public void setContratos(List<Contrato> contratos) {
    // this.contratos = contratos;
    // }

    public void addContrato(Contrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(Contrato contrato) {
        contratos.remove(contrato);
    }

    public double ganho(int ano, int mes) {
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
        for (Contrato contrato : contratos) {
            calendario.setTime(contrato.getData());
            int anoContrato = calendario.get(Calendar.YEAR);
            int mesContrato = calendario.get(Calendar.MONTH);
            if (ano == anoContrato && mes == (mesContrato + 1)) {
                soma += contrato.valorTotal();
            }
        }
        return soma;
    }

}