public class Main {
    public static void main(String[] args) {
        String dadosDoSistema = "Vendas: 100, Erros: 0";

        System.out.println(">>> Sistema Operando Normalmente");
        FabricaRelatorio fabrica1 = new FabricaRelatorioDiario();
        fabrica1.processarRelatorio(dadosDoSistema);

        System.out.println("\n--------------------------------\n");

        System.out.println(">>> Sistema em Crise");
        String dadosCriticos = "FALHA NO SERVIDOR";
        FabricaRelatorio fabrica2 = new FabricaRelatorioEmergencial();
        fabrica2.processarRelatorio(dadosCriticos);
    }
}