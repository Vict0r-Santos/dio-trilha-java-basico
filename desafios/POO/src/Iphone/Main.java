package Iphone;

public class Main {

	public static void main(String[] args) {
		
		iPhone meuIphone = new iPhone();

        meuIphone.ligar();

        
        ReprodutorMusical reprodutorMusical = meuIphone.getReprodutorMusical();
        reprodutorMusical.selecionarMusica("Música 1");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        
        AparelhoTelefonico aparelhoTelefonico = meuIphone.getAparelhoTelefonico();
        aparelhoTelefonico.ligar("3,14151617");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioDeVoz();

        
        NavegadorInternet navegadorInternet = meuIphone.getNavegadorInternet();
        navegadorInternet.exibirPagina("www.Dio.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        meuIphone.desligar();
	}

}
