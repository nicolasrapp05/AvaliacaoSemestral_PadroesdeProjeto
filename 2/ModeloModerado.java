public class ModeloModerado implements CalculoRisco {
    @Override
    public void calcularPerfil(double valorPatrimonio) {
        System.out.println("--- Aplicando Modelo Moderado ---");
        System.out.printf("Risco estimado sobre R$ %.2f: Médio.\n", valorPatrimonio);
    }
}