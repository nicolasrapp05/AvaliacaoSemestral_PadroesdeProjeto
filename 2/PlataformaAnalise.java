public class PlataformaAnalise {
    private CalculoRisco estrategiaCalculo;

    public PlataformaAnalise(CalculoRisco estrategiaInicial) {
        this.estrategiaCalculo = estrategiaInicial;
    }

    public void setEstrategiaCalculo(CalculoRisco novaEstrategia) {
        this.estrategiaCalculo = novaEstrategia;
    }

    public void executarAnalise(double patrimonio) {
        if (estrategiaCalculo == null) {
            System.out.println("Nenhum modelo de cálculo definido.");
            return;
        }
        estrategiaCalculo.calcularPerfil(patrimonio);
    }
}