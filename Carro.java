public class Carro {
    private double consumoCombustivel;
    private double nivelCombustivel;

    public Carro(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        this.nivelCombustivel = 0;
    }

    public void andar(double distancia) {
        double combustivelConsumido = distancia / consumoCombustivel;
        if (combustivelConsumido <= nivelCombustivel) {
            nivelCombustivel -= combustivelConsumido;
            System.out.println("O carro percorreu " + distancia + " km.");
        } else {
            System.out.println("O carro não tem combustível suficiente para percorrer essa distância.");
        }
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void adicionarGasolina(double quantidade) {
        nivelCombustivel += quantidade;
        System.out.println("Foram adicionados " + quantidade + " litros de combustível.");
    }

}