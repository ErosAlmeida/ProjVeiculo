package fakedb;
import java.util.ArrayList;
import dominio.ClasseVeiculo;


public abstract class BaseFakeDB<TDominio> {
    protected ArrayList<TDominio> tabela;

 
@SuppressWarnings("unchecked")
public ArrayList<ClasseVeiculo> gettabela(){
    return (ArrayList<ClasseVeiculo>) tabela;
   }

   protected abstract void preencherDados();
   
   public BaseFakeDB(){
    this.preencherDados();
   }
}