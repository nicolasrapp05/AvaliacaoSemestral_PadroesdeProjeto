public abstract class FabricaRelatorio {
    public abstract Relatorio criarRelatorio();

    public void processarRelatorio(String dados) {
        Relatorio relatorio = criarRelatorio();
        relatorio.gerar(dados);
    }
}