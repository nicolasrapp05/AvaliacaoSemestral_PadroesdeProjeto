public class RelatorioDiario implements Relatorio {
    @Override
    public void gerar(String dados) {
        System.out.println("--- Gerando Relatório Diário ---");
        System.out.println("Prioridade: Baixa");
    }
}