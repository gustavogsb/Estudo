package classe;

public class ValorPadrao {
	
	//Vari�veis de classe ou de inst�ncia tem valores padr�o
	static int a;
	static boolean aa;
	
	public static void main(String[] args) {
				
		System.out.println(a);
		System.out.println(aa);
		
		//Vari�veis locais tem que ser inicializada de forma expl�cita
		int b = 0;
		System.out.println(b);
	}

}
