package dominio;

public abstract class BaseParamentro {
    protected int codigo; 
    protected String Marca;
    protected String Modelo;
    protected int anoFabricacao;
    protected double preco;

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public int getanoFabricacao(){
        return anoFabricacao;
    }
    public void setanoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    public double getpreco(){
        return preco;
    }
    public void setpreco(double preco){
        this.preco = preco;
    }
 
  public BaseParamentro(){
  }

  public BaseParamentro(int codigo, String Marca, String Modelo, int anoFabricacao, double preco){
    this.codigo = codigo;
    this.Marca = Marca;
    this.Modelo = Modelo;
    this.anoFabricacao = anoFabricacao;
    this.preco = preco;
  }
}