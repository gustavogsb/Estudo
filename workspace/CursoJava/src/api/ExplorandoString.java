package api;

public class ExplorandoString {

	public static void main(String[] args) {

		String nome = new String("Gustavo"); // Funciona, mas n�o � usado nem recomendado
		nome = "Leo" + "nardo";
		
		//Alguns m�todos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.indexOf('d'));
		System.out.println(nome.charAt(6));
		System.out.println(nome.equalsIgnoreCase("leonardo"));
		System.out.println(nome.startsWith("Leo"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" � legal").concat("!"));
		
		//String Imut�vel
		System.out.println(nome);
		
		//Mudando a vari�vel pq eu fiz uma atribui��o
		nome = nome.toUpperCase().substring(0, 3).concat(" � legal !");
		
		System.out.println(nome);

	}

}
