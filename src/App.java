public class App {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Bohemian Rhapsody");

        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();


        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

    }
}