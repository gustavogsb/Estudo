package classe;

public class ValorPadrao {
	
	//Variáveis de classe ou de instância tem valores padrão
	static int a;
	static boolean aa;
	
	public static void main(String[] args) {
				
		System.out.println(a);
		System.out.println(aa);
		
		//Variáveis locais tem que ser inicializada de forma explícita
		int b = 0;
		System.out.println(b);
	}

}
