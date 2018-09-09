package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {

		//conjunto heterogeno, não aconselhável
		Set conjunto = new HashSet(); // Polimorfismo ou Hashset conjunto = new Hashset(); 
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add....");
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		System.out.println("Size(presete em todas as collection): "+conjunto.size());
		
		System.out.println("Remove...");
		System.out.println(conjunto.remove("a"));
		System.out.println(conjunto.remove('a'));
		System.out.println("Size(presete em todas as collection): "+conjunto.size());
		
		System.out.println("Contem...");
		System.out.println(conjunto.contains('a'));
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//União de dois conjuntos
		//conjunto.addAll(nums); // Adiciono dentro de conjunto 'conjunto' o conjunto 'nums'
		
		//Interseção de dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto.size()); //Somente um elemento em comum
		
		//Limpa conteúdo do conjunto
		conjunto.clear();
		System.out.println(conjunto.isEmpty());
		
		
		
		
		
		
		

	}

}
