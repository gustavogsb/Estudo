package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;

		//Incremento e decremento
		num1++; //Pós fixado
		System.out.println(num1);

		--num1; // Pré fixado
		System.out.println(num1);

		System.out.println(++num1 == num2--); //incremento antes da comparação(num1=2) e decremento depois da comparação(num2=2)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);//depois de incrementado vai dar falso

		//Complemento binário
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));//como é interio tem 4 bytes(conjunto de 8 bits) e no print anterio não exibe pq é zero a esquerda

		//Negação
		System.out.println(!false);
		System.out.println(!true);		

	}

}
