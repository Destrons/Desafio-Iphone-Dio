public class ReprodutorMusical implements iPhone {

    @Override
    public void exemploMetodo1() {
        System.out.println("Reprodutor Musical: Exemplo Método 1");
    }

    @Override
    public void exemploMetodo2(String exemplo) {
        System.out.println("Reprodutor Musical: Exemplo Método 2 com parâmetro: " + exemplo);
    }

    public void tocar() {
        System.out.println("Reprodutor Musical: Tocando música");
    }

    public void pausar() {
        System.out.println("Reprodutor Musical: Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Reprodutor Musical: Música selecionada: " + musica);
    }
}