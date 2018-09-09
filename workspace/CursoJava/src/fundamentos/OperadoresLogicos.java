package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executoutrabalho2 = true;

		boolean comprouSorvete = executouTrabalho1 || executoutrabalho2;
		boolean comprouTv50	   = executouTrabalho1 && executoutrabalho2;
		boolean comprouTv32	   = executouTrabalho1 ^ executoutrabalho2;

		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("TV 50 = " + comprouTv50);
		System.out.println("TV 32 = " + comprouTv32);
		//Operador unário intrusi
		System.out.println("Fome = " + !comprouSorvete);

	}

}
