public class NavegadorInternet implements iPhone{

    @Override
    public void exemploMetodo1() {
        System.out.println("Navegador Internet: Exemplo Método 1");
    }

    @Override
    public void exemploMetodo2(String exemplo) {
        System.out.println("Navegador Internet: Exemplo Método 2 com parâmetro: " + exemplo);
    }
    
    public void exibirPagina(String url) {
        System.out.println("Navegador Internet: Exibindo página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Navegador Internet: Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Navegador Internet: Página atualizada");
    }
}