package ExcImpostoDeRendaDeCadastroPessoal;

public class ImpostoCpf extends CadastroPessoa {
    private Double GastosSaude;

    public ImpostoCpf() {
    }

    public ImpostoCpf(Double gastosSaude) {
        GastosSaude = gastosSaude;
    }

    public ImpostoCpf(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        GastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return GastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        GastosSaude = gastosSaude;
    }

    @Override
    public Double imposto() {
        if (getRendaAnual() < 20000){
            return getRendaAnual() * 0.15 - GastosSaude * 0.5;

        }
        else{
            return getRendaAnual() * 0.25 - GastosSaude * 0.5;
        }

    }
}