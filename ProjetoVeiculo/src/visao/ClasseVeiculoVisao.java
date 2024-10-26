package visao;

import java.util.ArrayList;
import dominio.ClasseVeiculo;
import servico.ClasseVeiculoServico;

public class ClasseVeiculoVisao {
    
    private ClasseVeiculoServico srv;

    public ClasseVeiculoVisao(){
        this.srv = new ClasseVeiculoServico();
    }

    public void Exibir(){
        ArrayList<ClasseVeiculo> lista = this.srv.Navegar();
        System.out.println("===========================================================");
        for (ClasseVeiculo cp : lista) {
            this.Imprimir(cp);
        }
    }

    public void ExibirPorLinha(){
        ArrayList<ClasseVeiculo> lista = this.srv.Navegar();
        System.out.println("===========================================================");
        for (ClasseVeiculo cp : lista) {
            this.ImprimirPorLinha(cp);
        }
    }

    public void Imprimir(ClasseVeiculo cp){
        System.out.println("Classe de Produto:");
        System.out.println("Código: " + cp.getCodigo());
        System.out.println("Marca: " + cp.getMarca());
        System.out.println("Modelo: " + cp.getModelo());
        System.out.println("Ano de fabricacao: " + cp.getanoFabricacao());
        System.out.println("Preco: " + cp.getpreco());
        
        System.out.println("--------------------------------------------------------");
    }

    public void ImprimirPorLinha(ClasseVeiculo cp){
        String mensagem = "";
        mensagem += "Classe de Produto: ";
        mensagem += "Código: " + cp.getCodigo() + " | ";
        mensagem += "Marca: " + cp.getMarca() + " | ";
        mensagem += "Modelo: " + cp.getModelo() + " | ";
        mensagem += "Ano de fabricacao: " + cp.getanoFabricacao() + " | ";
        mensagem += "Preco: " + cp.getpreco() + " | ";
       
        System.out.println(mensagem);
    }

    public void ImprimirPorLinha(int chave){
        ClasseVeiculo cp = this.srv.Ler(chave);
        this.ImprimirPorLinha(cp);
    }


    public void Criar(ClasseVeiculo novo){
        this.srv.Adicionar(novo);
    }

    public void Editar(int chave, ClasseVeiculo alt){
        ClasseVeiculo cp = this.srv.Ler(chave);
        if (cp != null){
            cp.setMarca(alt.getMarca());
            cp.setModelo(alt.getModelo());
            cp.setanoFabricacao(alt.getanoFabricacao());
            cp.setpreco(alt.getpreco());
        }
        else{
            System.out.println("Item não localizado.");
        }
    }

    public void Remover(int chave){
        ClasseVeiculo cp = this.srv.Ler(chave);
        if (cp != null){
            this.srv.Remover(chave);
        }
        else{
            System.out.println("Item não localizado.");
        }

    }
}
