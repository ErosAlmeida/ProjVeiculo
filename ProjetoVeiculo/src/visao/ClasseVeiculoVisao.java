package visao;

import java.util.ArrayList;
import dominio.ClasseVeiculo;
import fakedb.ClasseVeiculoFakeDB;

public class ClasseVeiculoVisao{

    public ClasseVeiculoVisao(){
    }

    public void Exibir(){
        ClasseVeiculoFakeDB db = new ClasseVeiculoFakeDB();
        ArrayList<ClasseVeiculo> lista = db.gettabela();
        for(ClasseVeiculo cp : lista){
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
}
