package controle;

public class If {

	public static void main(String[] args) {
		double nota = 9.5;
		boolean bomComportamento = false;
		
		if(nota >=9 && bomComportamento){
			System.out.println("Quadro de honra 1!");
		}
		
		//vai imprimir pq o ; termina uma senten�a me java a impress�o est� sozinha
		if(nota >=9 && bomComportamento);{
			System.out.println("Quadro de honra 2!");
		}		

	}

}
