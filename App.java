public class App {

    public static void main(String[] args) {
        Carro meuFusca = new Carro(15);

        meuFusca.adicionarGasolina(20);

        meuFusca.andar(100);

        double nivelCombustivel = meuFusca.getNivelCombustivel();
        System.out.println("Combustível restante: " + nivelCombustivel + " litros");
    }
}
