package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		/*
		 * http://www.guj.com.br/t/duvida-em-como-tirar-certificacao-java/324315/2
		 * 
		 * http://www.guj.com.br/t/orientacao-para-tira-certificacao-java/341196/4
		 * 
		 * http://www.devmedia.com.br/introducao-a-certificacao-de-programador-java/32166
		 * 
		 */
		
		Queue<String> fila = new LinkedList<>();
		
		//offer: Se não conseguir adicionar retorna false
		//add  : Se não conseguir adicionar retorna um ERRO
		fila.offer("Maria"); 
		fila.offer("Joao");
		fila.add("Pedro");
		
		/* Peek / Element
		 * Consultam o primeiro elemento da fila
		 * Quando a fila está vazia:
		 *   - Peek retorna NULL
		 *   - Element retorna ERRO
		 */
		System.out.println("Peek/Element.....");
		System.out.println("Peek    " + fila.peek());
		System.out.println("Element " + fila.element());
		
		
		System.out.println("Poll/Remove.....");
		System.out.println(fila.poll()); // Remove e retorna o primeiro elemento da fila
		System.out.println(fila.remove());// Remove e retorna o primeiro elemento da fila 
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Retorna NULL se não encontrar elemento na fila
		//System.out.println(fila.remove()); // Retorna ERRO se não encontrar elemento na fila
	}

}
