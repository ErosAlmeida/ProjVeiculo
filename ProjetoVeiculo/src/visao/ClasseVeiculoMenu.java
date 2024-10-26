package visao;

import java.util.ArrayList;
import dominio.ClasseVeiculo;
import servico.ClasseVeiculoServico;

public class ClasseVeiculoMenu extends BaseMenu {

    private ClasseVeiculoServico srv;

    public ClasseVeiculoMenu() {
        super();
        this.srv = new ClasseVeiculoServico();
    }

    @Override
    public void ExibirMenu() {
        int opcao = 0;
        while (opcao != 9) {
            limparConsole();
            System.out.println("Cadastro de Classes de veiculo");
            System.out.println("1 - Listar");
            System.out.println("2 - Localizar");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("9 - Sair");
            System.out.print("Selecione uma opção: ");
            opcao = this.scanner.nextInt();
            this.scanner.nextLine(); // Consumir a nova linha
            switch (opcao) {
                case 1:
                    this.Listar();
                    break;
                case 2:
                    this.Localizar();
                    break;
                case 3:
                    this.Adicionar();
                    break;
                case 4:
                    this.Atualizar();
                    break;
                case 5:
                    this.Remover();
                    break;
                case 9:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }
 
    private void limparConsole() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ClasseVeiculoServico getSrv() {
        return srv;
    }

    @Override
    public void Listar() {
        limparConsole();
        System.out.println("Listando");

        ArrayList<ClasseVeiculo> lista = this.srv.Navegar();
        for (ClasseVeiculo cp : lista) {
            this.ImprimirPorLinha(cp);
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
        limparConsole();
        System.out.println("Localizando");

        System.out.print("Informe o código da Classe do veiculo: ");
        int cod = this.scanner.nextInt();
        this.scanner.nextLine(); // Consumir a nova linha

        ClasseVeiculo cp = this.srv.Ler(cod);
        if (cp != null) {
            this.ImprimirPorLinha(cp);
        } else {
            System.out.println("Problema - Classe do veiculo não encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
    }

    @Override
    public void Adicionar() {
        limparConsole();
        System.out.println("Adicionando");
    
        // Solicitar informações do veículo
        System.out.print("Informe o Código: ");
        int codigo = this.scanner.nextInt();
        this.scanner.nextLine(); // Consumir a nova linha
    
        System.out.print("Informe a Marca: ");
        String marca = this.scanner.nextLine();
    
        System.out.print("Informe o Modelo: ");
        String modelo = this.scanner.nextLine();
    
        System.out.print("Informe o Ano de Fabricação: ");
        int anoFabricacao = this.scanner.nextInt();
        
        System.out.print("Informe o Preço: ");
        double preco = this.scanner.nextDouble();
        this.scanner.nextLine(); // Consumir a nova linha
    
        // Criar um novo objeto ClasseVeiculo com os dados fornecidos
        ClasseVeiculo cp = new ClasseVeiculo();
        cp.setCodigo(codigo);
        cp.setMarca(marca);
        cp.setModelo(modelo);
        cp.setanoFabricacao(anoFabricacao);
        cp.setpreco(preco);
    
        // Adicionar o veículo usando o serviço
        if (this.srv.Adicionar(cp) != null) {
            System.out.println("Classe do Veiculo adicionada com sucesso");
        } else {
            System.out.println("Problema - Erro ao adicionar Classe do Veiculo");
        }
        
        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
    }

    @Override
    public void Atualizar() {
        limparConsole();
        System.out.println("Atualizando");
    
        System.out.print("Informe o código da Classe do Veiculo que deseja atualizar: ");
        int cod = this.scanner.nextInt();
        this.scanner.nextLine(); // Consumir a nova linha
    
        ClasseVeiculo cp = this.srv.Ler(cod);
        if (cp != null) {
            // Solicitar novas informações para atualização
            System.out.print("Informe o novo Código: ");
            int novoCodigo = this.scanner.nextInt();
            this.scanner.nextLine(); // Consumir a nova linha
    
            System.out.print("Informe a nova Marca: ");
            String novaMarca = this.scanner.nextLine();
    
            System.out.print("Informe o novo Modelo: ");
            String novoModelo = this.scanner.nextLine();
    
            System.out.print("Informe o novo Ano de Fabricação: ");
            int novoAnoFabricacao = this.scanner.nextInt();
            
            System.out.print("Informe o novo Preço: ");
            double novoPreco = this.scanner.nextDouble();
            this.scanner.nextLine(); // Consumir a nova linha
    
            // Atualizar os atributos do veículo
            cp.setCodigo(novoCodigo);
            cp.setMarca(novaMarca);
            cp.setModelo(novoModelo);
            cp.setanoFabricacao(novoAnoFabricacao);
            cp.setpreco(novoPreco);
    
            // Chamar o serviço para atualizar o veículo
            if (this.srv.Editar(cp) != null) {
                System.out.println("Alteração realizada com sucesso");
            } else {
                System.out.println("Problema - alteração não foi realizada");
            }
        } else {
            System.out.println("Problema - Classe do Veiculo não encontrada");
        }
    
        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
    }

    @Override
    public void Remover() {
        limparConsole();
        System.out.println("Removendo");
    
        System.out.print("Informe o código da Classe do Veiculo que deseja remover: ");
        int cod = this.scanner.nextInt();
        this.scanner.nextLine(); // Consumir a nova linha
    
        ClasseVeiculo cp = this.srv.Ler(cod);
        if (cp != null) {
            if (this.srv.Remover(cod) != null) {
                System.out.println("Classe do Veiculo excluída com sucesso");
            } else {
                System.out.println("Problema - Classe do Veiculo não foi excluída");
            }
        } else {
            System.out.println("Problema - Classe do Veiculo não encontrada");
        }
    
        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
    }

    private void ImprimirPorLinha(ClasseVeiculo cp) {
        String mensagem = "";
        mensagem += "Classe do Veiculo: ";
        mensagem += "Código: " + cp.getCodigo() + " | ";
        mensagem += "Marca: " + cp.getMarca() + " | ";
        mensagem += "Modelo: " + cp.getModelo() + " | ";
        mensagem += "Ano de fabricacao: " + cp.getanoFabricacao() + " | ";
        mensagem += "Preco: " + cp.getpreco() + " | ";
        System.out.println(mensagem);
    }    
}
