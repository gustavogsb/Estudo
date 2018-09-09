package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		//mudar essas cores para ver o resultado
		String faixa = "verde";
		

		switch(faixa.toLowerCase()){
		case "preta":
			System.out.println("Sou Mestre");
		case "marron":
			System.out.println("Sou quase Mestre");
		case "roxa":
			System.out.println("Sou faixa roxa");
		case "verde":
			System.out.println("Sou faixa verde");
		case "laranja":
			System.out.println("Sou faixa laranja");
		case "vermelha":
			System.out.println("Sou faixa vermelha");			
		case "amarela":
			System.out.println("Sou faixa amarela");
		default:
			System.out.println("Sou novato"); //pode ficar em qq posição. Se colocado na primeira e não tiver a string, executa todos abaixo
		}

	}

}
