public class AparelhoTelefonico implements iPhone {

    @Override
    public void exemploMetodo1() {
        System.out.println("Aparelho Telefônico: Exemplo Método 1");
    }

    @Override
    public void exemploMetodo2(String exemplo) {
        System.out.println("Aparelho Telefônico: Exemplo Método 2 com parâmetro: " + exemplo);
    }
    
    public void ligar(String numero) {
        System.out.println("Aparelho Telefônico: Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Aparelho Telefônico: Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Aparelho Telefônico: Correio de voz iniciado");
    }
}