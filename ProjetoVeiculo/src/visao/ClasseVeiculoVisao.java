package visao;

import java.util.ArrayList;
import dominio.ClasseVeiculo;
import servico.ClasseVeiculoServico;

public class ClasseVeiculoVisao{

    private ClasseVeiculoServico srv;

    public ClasseVeiculoVisao(){
        this.srv = new ClasseVeiculoServico();
    }

    public void Criar(){
        ClasseVeiculo cp = new ClasseVeiculo();
        cp.setCodigo(0);
        cp.setModelo("Teste");
        cp.setMarca("Testando");
        cp.setanoFabricacao(2022);
        cp.setpreco(150.000);
        this.srv.Adicionar(cp);
    }

    public void Exibir(){
        ArrayList<ClasseVeiculo> lista = this.srv.Navegar(); 
        System.out.println("=====================================================================");
        for(ClasseVeiculo cp : lista){
         this.imprimir(cp);
        }
    }

    public void ExibirPorLinha(){
        ArrayList<ClasseVeiculo> lista = this.srv.Navegar(); 
        System.out.println("======================================================================");
        for(ClasseVeiculo cp : lista){
         this.imprimirPorLinha(cp);
        }
    }

    public void ExibirApenasUm(int chave){
        ClasseVeiculo cp = this.srv.Ler(chave);
        System.out.println("======================================================================================");
        this.imprimirPorLinha(cp);
    }

    private void imprimir(ClasseVeiculo cp){
        System.out.println("Classe de produto");
        System.out.println("Codigo: " + cp.getCodigo());
        System.out.println("Marca: " + cp.getMarca());
        System.out.println("Modelo: " + cp.getModelo());
        System.out.println("Ano de fabricacao: " + cp.getanoFabricacao());
        System.out.println("Preço do carro: " + cp.getpreco());
        System.out.println("======================================================================");

    }

    private void imprimirPorLinha(ClasseVeiculo cp){
        String mensagem = "";
        mensagem += "Classe de produto";
        mensagem += "Codigo: " + cp.getCodigo() + " | ";
        mensagem += "Marca: " + cp.getMarca() + " | ";
        mensagem += "Modelo: " + cp.getModelo() + " | ";
        mensagem += "Ano de fabricacap: " + cp.getanoFabricacao() + " | ";
        mensagem += "Preco: " + cp.getpreco();
        System.out.println(mensagem);
        System.out.println("========================================================================");
    }
}
