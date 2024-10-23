package visao;

public class Util {
    public static void LimparConsole(){
        System.out.print("\033[H\033[2J");   
        System.out.flush();    
        
    // Método para limpar o console (funciona no terminal, pode não funcionar em IDEs como Eclipse)
    public static void LimparConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Comando para limpar o console no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Comando para limpar o console em sistemas Unix (Linux, Mac)
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ex) {
            System.out.println("Erro ao limpar o console.");
        }
    }

    // Você pode adicionar outros métodos utilitários conforme necessário

    }
}