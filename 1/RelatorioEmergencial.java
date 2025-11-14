public class RelatorioEmergencial implements Relatorio {
    @Override
    public void gerar(String dados) {
        System.out.println("!!! ALERTA: Gerando Relatório Emergencial !!!");
        System.out.println("Prioridade: MÁXIMA");
    }
}