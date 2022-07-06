package entidades;

public class Departamento {
    private String nome;

    public Departamento(){
    
    }

    public Departamento(String nome){
        this.nome = nome;
    }

    public String getDepartamento(){
        return nome;
    }

    public void setDepartamento(String nome){
        this.nome = nome;
    }
}
