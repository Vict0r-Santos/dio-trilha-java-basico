package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		selecaoCandidato();


	}
	
	static void selecaoCandidato () {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "DANIELA", "JORDAN", "MARCO"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioPretendido);
			
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado. ");
				candidatosSelecionados++;
			}
			candidatoAtual++;
			
		}
		
		
	}
	
	static double valorPretendido () {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;
		
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
