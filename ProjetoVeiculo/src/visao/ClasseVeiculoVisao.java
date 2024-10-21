package visao;

import java.util.ArrayList;
import dominio.ClasseVeiculo;
import repositorio.ClasseVeiculoRepo;

public class ClasseVeiculoVisao{

    public ClasseVeiculoVisao(){
    }

    public void Exibir(){
       ClasseVeiculoRepo repo = new ClasseVeiculoRepo();
       ArrayList<ClasseVeiculo> lista = repo.Browse();
        for(ClasseVeiculo cp : lista){
         this.imprimir(cp);
        }
    }

    private void imprimir(ClasseVeiculo cp){
        System.out.println("================================================");
        System.out.println("Classe de produto");
        System.out.println("Codigo: " + cp.getCodigo());
        System.out.println("Marca: " + cp.getMarca());
        System.out.println("Modelo: " + cp.getModelo());
        System.out.println("Ano de fabricacao: " + cp.getanoFabricacao());
        System.out.println("Preço do carro: " + cp.getpreco());
        System.out.println("==================================================");

    }
}
