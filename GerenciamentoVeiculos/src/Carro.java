public class Carro extends Veiculo {
    public int numeroPortas;

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return String.format(
                "Carro:\nMarca: %s\nModelo: %s\nAno: %d\nNúmero de Portas: %d",
                marca, modelo, getAno(), numeroPortas
        );
    }
}
