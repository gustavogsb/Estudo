package avancado;

public class Recursividade {

	public static void main(String[] args) {

		 System.out.println(fatorialFor(5));
		 System.out.println(fatorialFor(4));
		 System.out.println(fatorialFor(3));
		 
		 
		 System.out.println(fatorial(5));
	}

	
	public static int fatorialFor(int numero){
		int fatorial = 1;
		
		for(int i =1; i <= numero; i++){
			fatorial = fatorial * i;
		}
		
		return fatorial;
	}
	
	public static int fatorial(int numero){
		if(numero <= 1){
			return 1;
		}
		
		return numero * fatorial(numero -1);
		
	}
}
