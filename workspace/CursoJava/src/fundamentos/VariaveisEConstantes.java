package fundamentos;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("A �rea da circufer�ncia � "+area+" m2");
		
		System.out.printf("A �rea da circunfer�cia � %f m2 \n", area);
		
		System.out.printf("A �rea da circunfer�cia � %.2f m2 ", area);
		

	}

}
