package servico;

import java.util.ArrayList;

import dominio.ClasseVeiculo;
import repositorio.ClasseVeiculoRepo;

public class ClasseVeiculoServico extends BaseServico<ClasseVeiculo> {

    private ClasseVeiculoRepo repositorio;

    public ClasseVeiculoServico(){
        this.repositorio = new ClasseVeiculoRepo();
    }

    @Override
    public ArrayList<ClasseVeiculo> Navegar() {
        return this.repositorio.Browse();
    }

    @Override
    public ClasseVeiculo Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public ClasseVeiculo Editar(ClasseVeiculo obj) {
        return this.repositorio.Edit(obj);
    }

    @Override
    public ClasseVeiculo Adicionar(ClasseVeiculo obj) {
        return this.repositorio.Add(obj);
    }

    @Override
    public ClasseVeiculo Remover(int chave) {
        return this.repositorio.Delet(chave);
    }
}