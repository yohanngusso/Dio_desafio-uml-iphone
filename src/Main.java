public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Testando o reprodutor musical
        iphone.tocar();
        iphone.selecionarMusica("Música 1");
        iphone.pausar();

        // Testando o aparelho telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando o navegador de internet
        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}