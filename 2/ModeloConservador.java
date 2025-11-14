public class ModeloConservador implements CalculoRisco {
    @Override
    public void calcularPerfil(double valorPatrimonio) {
        System.out.println("--- Aplicando Modelo Conservador ---");
        System.out.printf("Risco estimado sobre R$ %.2f: Baixo.\n", valorPatrimonio);
    }
}