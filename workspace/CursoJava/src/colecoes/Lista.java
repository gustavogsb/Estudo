package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		System.out.println("------------------------");
		
		System.out.println("Get....");
		System.out.println(aprovados.get(0));
		System.out.println("------------------------");
		
		System.out.println("Print na ordem de inserção");
		for(String aprovado: aprovados){
			System.out.println(aprovado);
		}		
		System.out.println("------------------------");
		
		
		System.out.println("Add....");
		System.out.println(aprovados.add("Maria"));
		System.out.println("Size : " + aprovados.size());
		System.out.println("------------------------");
		
		System.out.println("Print com Maria em duplicidade");
		for(String aprovado: aprovados){
			System.out.println(aprovado);
		}
		System.out.println("------------------------");
		
		System.out.println("Remove....");
		System.out.println(aprovados.remove("maria"));
		System.out.println("Size : " + aprovados.size());
		System.out.println("------------------------");
		
		System.out.println("Remove....");
		System.out.println(aprovados.remove("Maria"));
		System.out.println("Size : " + aprovados.size());
		System.out.println("------------------------");

		System.out.println("Print depois da primeira ocorrênca da Maria ser apagada");
		for(String aprovado: aprovados){
			System.out.println(aprovado);
		}

	}

}
