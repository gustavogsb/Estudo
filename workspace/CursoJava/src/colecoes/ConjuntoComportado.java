package colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		//Set<String> aprovados = new HashSet<>(); //N�o respeita a ordem de inser��o nem alfab�tica
		//Set<String> aprovados = new LinkedHashSet<>(); //Respeita a ordem de inserc�o
		Set<String> aprovados = new TreeSet<>(); //N�o respeita a ordem de inser��o mas ordena
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");		

		for(String aprovado: aprovados){
			System.out.println(aprovado); 
		}
	}

}
