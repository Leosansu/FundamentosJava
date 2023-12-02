package Funcionario;

public class CadastroFuncionario {
    private String nome;
    private Double salario;
    private Integer id;
    public CadastroFuncionario(){

    }
    public CadastroFuncionario(String nome, double salario,int id){
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void AumentoSalario(Double porcentagem){
        salario += (salario * porcentagem) / 100;
    }

    @Override
    public String toString() {
        return "Nome: "+ nome
                +" , ID: "+id
                +" , Salário: "+salario;
    }
}


