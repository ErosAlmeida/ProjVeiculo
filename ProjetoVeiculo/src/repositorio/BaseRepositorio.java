package repositorio;

import java.util.ArrayList;

import dominio.ClasseVeiculo;

public abstract class BaseRepositorio<TDominio> {
    
    protected ArrayList<TDominio> dados;

    public ArrayList<TDominio> Browse(){
        return this.dados;
    }
    public abstract ClasseVeiculo Read(int chave);
    public abstract ClasseVeiculo Edit(TDominio instancia);
    public abstract ClasseVeiculo Add(TDominio instancia);
    public abstract ClasseVeiculo Delet(int chave);
}
