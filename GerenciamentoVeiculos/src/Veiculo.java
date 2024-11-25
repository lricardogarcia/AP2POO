public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Métodos abstratos
    public abstract String informacoesVeiculo();

    // Métodos getter e setter para o atributo ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
