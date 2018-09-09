package colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		//Set<String> aprovados = new HashSet<>(); //Não respeita a ordem de inserção nem alfabética
		//Set<String> aprovados = new LinkedHashSet<>(); //Respeita a ordem de insercão
		Set<String> aprovados = new TreeSet<>(); //Não respeita a ordem de inserção mas ordena
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");		

		for(String aprovado: aprovados){
			System.out.println(aprovado); 
		}
	}

}
