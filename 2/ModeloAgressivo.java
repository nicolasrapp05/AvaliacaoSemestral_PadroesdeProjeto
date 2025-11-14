public class ModeloAgressivo implements CalculoRisco {
    @Override
    public void calcularPerfil(double valorPatrimonio) {
        System.out.println("--- Aplicando Modelo Agressivo ---");
        System.out.printf("Risco estimado sobre R$ %.2f: Alto.\n", valorPatrimonio);
    }
}