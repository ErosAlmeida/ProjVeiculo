package dominio;

public class SubClasseVeiculo extends BaseParamentro {
   private int codigoVeiculo;

   public int  getcodigoVeiculo(){
    return codigoVeiculo;
   }
   public void setcodigoVeiculo(int codigoVeiculo){
    this.codigoVeiculo = codigoVeiculo;
   }

   public SubClasseVeiculo(){
   }

   public SubClasseVeiculo(int codigo, String Marca, String Modelo, int anoFabricacao, double preco){
    super(codigo, Marca, Modelo, anoFabricacao, preco);

   }
}
