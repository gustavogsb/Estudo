package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;

		//Incremento e decremento
		num1++; //P�s fixado
		System.out.println(num1);

		--num1; // Pr� fixado
		System.out.println(num1);

		System.out.println(++num1 == num2--); //incremento antes da compara��o(num1=2) e decremento depois da compara��o(num2=2)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);//depois de incrementado vai dar falso

		//Complemento bin�rio
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));//como � interio tem 4 bytes(conjunto de 8 bits) e no print anterio n�o exibe pq � zero a esquerda

		//Nega��o
		System.out.println(!false);
		System.out.println(!true);		

	}

}
