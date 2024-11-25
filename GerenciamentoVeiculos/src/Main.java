public class Main {
    public static void main(String[] args) {
        // Instância de Carro
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.setAno(2020);
        carro.numeroPortas = 4;

        // Instância de Moto
        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "CB 500X";
        moto.setAno(2022);
        moto.setCilindrada(500);

        // Impressão das informações dos veículos
        System.out.println(carro.informacoesVeiculo());
        System.out.println();
        System.out.println(moto.informacoesVeiculo());
    }
}
