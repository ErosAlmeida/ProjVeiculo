package dominio;
public class ClasseVeiculo extends BaseParamentro{
    
    public ClasseVeiculo(){
        super();// Herda do pai
    }

    public ClasseVeiculo(int codigo, String Marca, String Modelo, int anoFabricacao, double preco){
        super(codigo, Marca, Modelo, anoFabricacao, preco);
    }
}