package colecoes;

public class EnderecoTeste {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco("Rua loop infinito", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua loop infinito", 1, "Sala 1001");
		
		//Retrona FALSE pq s�o dois endere�os de mem�rias diferentes
		System.out.println(endereco1 == endereco2);
		
		//Retrona FALSE pq dentro da classe Endere�o n�o foi implementado o EQUALS. o Equals do Object
		System.out.println(endereco1.equals(endereco2));
	}

}
