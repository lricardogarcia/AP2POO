public class Moto extends Veiculo {
    private int cilindrada;

    // Getter e setter para o atributo cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return String.format(
                "Moto:\nMarca: %s\nModelo: %s\nAno: %d\nCilindrada: %dcc",
                marca, modelo, getAno(), cilindrada
        );
    }
}
