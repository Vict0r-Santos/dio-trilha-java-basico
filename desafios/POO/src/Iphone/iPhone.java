package Iphone;

public class iPhone {
	private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
    
    	public iPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
        }
    	
    	public void ligar() {
            System.out.println("iPhone ligado.");
        }

        public void desligar() {
            System.out.println("iPhone desligado.");
        }

        public ReprodutorMusical getReprodutorMusical() {
            return reprodutorMusical;
        }

        public AparelhoTelefonico getAparelhoTelefonico() {
            return aparelhoTelefonico;
        }

        public NavegadorInternet getNavegadorInternet() {
            return navegadorInternet;
        }
        
}
