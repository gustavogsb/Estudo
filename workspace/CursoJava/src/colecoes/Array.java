package colecoes;

public class Array {

	public static void main(String[] args) {
		double[] notasJoao = {7.0,8.7,6.2,4.9,9.7};// ou double []notasJoao = {7.0,8.7,6.2,4.9,9.7} ou double notasJoao[] = {7.0,8.7,6.2,4.9,9.7}
		
		double notasPedro[] = new double[5]; // ou double[] notasPedro = new double[5]; ou double []notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;
		
		double totalJoao = 0;
//		for(int i = 0; i < notasJoao.length; i++){
//			totalJoao += notasJoao[i];
//		}
		
		//for(each)
		for (double nota : notasJoao) {
			totalJoao += nota;
		}
		


		System.out.println("Total de Notas João: " + totalJoao);
		System.out.println("Média do João " + totalJoao / notasJoao.length);
		
		double totalPedro = 0;
//		for(int i = 0; i < notasPedro.length; i++){
//			totalPedro += notasPedro[i];
//		}
		
		//for(each)
		for (double n : notasPedro) {
			totalPedro += n;
		}		
		
		System.out.println("Total de Notas Pedro: " + totalPedro);
		System.out.println("Média do Pedro " + totalPedro / notasPedro.length);
	}

}
