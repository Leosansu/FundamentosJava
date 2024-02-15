package ExcImpostoDeRendaDeCadastroPessoal;

public class ImpostoCnpj extends CadastroPessoa {
    private Integer numeroFuncionarios;

    public ImpostoCnpj() {
        super();

    }

    public ImpostoCnpj(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public ImpostoCnpj(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double imposto() {
        if (numeroFuncionarios > 10){
            return getRendaAnual() * 0.14;
        }
        else{
            return getRendaAnual() * 0.16;
        }
    }
}
