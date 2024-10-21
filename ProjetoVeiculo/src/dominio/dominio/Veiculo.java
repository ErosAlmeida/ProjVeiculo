package dominio;

public class Veiculo extends BaseParamentro {
    private int codigoVeiculo;
    private double valor;

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Construtor padrão
    public Veiculo() {
    }

    // Construtor com parâmetros
    public Veiculo(int codigo, String marca, String modelo, int anoFabricacao, double preco) {
        super(codigo, marca, modelo, anoFabricacao, preco);
        this.codigoVeiculo = codigo;  // Usando o parâmetro "codigo" para inicializar o código do veículo
        this.valor = preco;           // Usando o parâmetro "preco" para inicializar o valor
    }
}