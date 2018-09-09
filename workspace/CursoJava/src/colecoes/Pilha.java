package colecoes;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<>();
		
		//Implementa a FILA e a PILHA
		//Deque<String> pilha2 = new ArrayDeque<>();
		
		pilha.push("O Pequeno Pr�ncipe");
		pilha.push("O Hobbit");
		pilha.push("Don Quixote");
		
		System.out.println("Peek() - Cosulta o topo da Pilha sem tira da pilha");
		System.out.println(pilha.peek());
		System.out.println("----------------------------------------------------");
		System.out.println("Pop() - Retorna e Retira do topo da pilha");
		System.out.println(pilha.pop());
		System.out.println("----------------------------------------------------");
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		//System.out.println(pilha.pop()); //Retorna ERRO pq a pilha est� vazia
		System.out.println("----------------------------------------------------");
		//System.out.println(pilha.peek()); //Retorna ERRO pq a pilha est� vazia

	}

}
