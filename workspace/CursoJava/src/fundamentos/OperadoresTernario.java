package fundamentos;

public class OperadoresTernario {

	public static void main(String[] args) {
		double nota = 7.1;
		double nota2 = 6.1;
		String resultado = nota >=7 ? "Aprovado" : "Recuperação"; //atribuição relacional
		String resultado2 = nota2 >=7 ? "Aprovado" : "Recuperação"; //atribuição relacional
		System.out.println("O primeiro resultado foi "+resultado +" \n O segundo resultado foi "+resultado2);
	}

}
