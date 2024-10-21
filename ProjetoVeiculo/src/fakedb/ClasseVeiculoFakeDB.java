package fakedb;
import java.util.ArrayList;
import dominio.ClasseVeiculo;

public class ClasseVeiculoFakeDB extends BaseFakeDB<ClasseVeiculo> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<ClasseVeiculo>();
        this.tabela.add(new ClasseVeiculo(1, "Honda" , "Civic", 2022, 120.00));
        this.tabela.add(new ClasseVeiculo(2, "Fiat" , "Mob", 2019, 150.00));
        this.tabela.add(new ClasseVeiculo(3, "Gol" , "Fox", 2024, 120.00));
        this.tabela.add(new ClasseVeiculo(4, "Wolksvagem" , "Saveiro", 2022, 120.00));
        this.tabela.add(new ClasseVeiculo(5, "Fiat" , "Uno", 2020, 120.00));
    }

    public ClasseVeiculoFakeDB(){
        super();
    }
}