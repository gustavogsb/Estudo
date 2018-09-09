package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer,String> aprovados = new HashMap<>();
		
		//Put() - Vai adicionar ou substituir caso já exista uma chave igual
		aprovados.put(1, "Pedro");
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");
		
		//retorna o conjunto de chaves
		System.out.println(aprovados.keySet());
		
		//retorna o conjunto de valores
		System.out.println(aprovados.values());
		
		//retorna o conjunto completo(chave, valor)
		System.out.println(aprovados.entrySet());
		
		//Substituir o conjunto(3,Bia) por (3,Beatriz)
		aprovados.put(3, "Beatriz");
		System.out.println(aprovados.get(3)); // o 3 não é o índice, é o valor da chave
		
		System.out.println(aprovados.containsKey(4));
		System.out.println(aprovados.containsValue("Bia"));
		
		System.out.println("Chaves...");
		for(Integer codigo: aprovados.keySet()){
			System.out.println(codigo);
		}
		
		System.out.println("------------------------------------");
		
		System.out.println("Valores...");
		for(String nome: aprovados.values()){
			System.out.println(nome);
		}
		
		System.out.println("------------------------------------");
		
		System.out.println("O registro(chave,valor)...");
		for(Entry<Integer, String> registro: aprovados.entrySet() ){
			System.out.println(registro.getKey() + " - " + registro.getValue());
		}
		
	}

}
