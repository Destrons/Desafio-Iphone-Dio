public class App {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        reprodutor.exemploMetodo1();
        reprodutor.exemploMetodo2("Teste Reprodutor");
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Bohemian Rhapsody");

        telefone.exemploMetodo1();
        telefone.exemploMetodo2("Teste Telefone");
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegador.exemploMetodo1();
        navegador.exemploMetodo2("Teste Navegador");
        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

    }
}