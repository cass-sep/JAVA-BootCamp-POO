package entidades;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FuncionarioAula {
    private int id;
    private String nome;
    private Date dataAdmissao;
    private float salario;
    private Date desligamento = null;

    public FuncionarioAula() {
    }

    public FuncionarioAula(int id, String nome, Date dataAdmissao, float salario) {
        this.id = id;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public FuncionarioAula(int id, String nome, Date dataAdmissao, float salario, Date desligamento) {
        this.id = id;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.desligamento = desligamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmissao() {
        DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
        return f.format(dataAdmissao);
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDesligamento() {
        DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
        return f.format(desligamento);
    }

    public void setDesligamento(Date desligamento) {
        this.desligamento = desligamento;
    }

    public int tempoServico(Date admissao) {
        Calendar data = new GregorianCalendar();
        data.setTime(admissao);
        Calendar hoje = Calendar.getInstance();

        int tempo = hoje.get(Calendar.YEAR) - data.get(Calendar.YEAR);

        data.add(Calendar.YEAR, tempo);

        if (hoje.before(data)) {
            tempo--;
        }
        return tempo;
    }

    public String toString() {
        DateFormat f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        if (desligamento == null) {
            return String.format("\n%s, prontuário %d trabalha desde %s, há %s anos, com salário atual de R$ %.2f.\n",
                    nome, id, f.format(dataAdmissao), tempoServico(dataAdmissao), salario);
        } else {
            return String.format("\n%s, prontuário %d trabalhou de %s, a %s, e seu salário foi de R$ %.2f.\n",
                    nome, id, f.format(dataAdmissao), f.format(desligamento), salario);

        }
    }

}
