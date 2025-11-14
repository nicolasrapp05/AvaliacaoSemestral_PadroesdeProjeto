public class Main {
    public static void main(String[] args) {
        double patrimonioCliente = 500_000.00;

        PlataformaAnalise plataforma = new PlataformaAnalise(new ModeloConservador());
        plataforma.executarAnalise(patrimonioCliente);

        System.out.println("\n--------------------------------\n");

        plataforma.setEstrategiaCalculo(new ModeloModerado());
        plataforma.executarAnalise(patrimonioCliente);

        System.out.println("\n--------------------------------\n");

        plataforma.setEstrategiaCalculo(new ModeloAgressivo());
        plataforma.executarAnalise(patrimonioCliente);
    }
}