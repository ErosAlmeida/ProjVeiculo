import visao.ClasseVeiculoVisao;

public class App {
    public static void main(String[] args) throws Exception {
        ClasseVeiculoVisao visao = new ClasseVeiculoVisao();

        visao.ExibirPorLinha();

        visao.Criar();
        visao.ExibirApenasUm(6);

        visao.ExibirPorLinha();
    }
}
