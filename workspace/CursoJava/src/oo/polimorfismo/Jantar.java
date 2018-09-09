package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.280);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.160);
		
		Pessoa pessoa = new Pessoa(80.7);
		////pessoa.comer(arroz);
		////pessoa.comer(feijao);
		// vai dar ERRO pq a pessoa n�o est� preparada para comer sorvete. Polimorfismo est�tico(preso ao c�digo)
		//Tive que criar um m�todo de comer sorvete na classe pessoa para fincionar
		////pessoa.comer(sorvete);
		
		//depois eu implementei o polimorfismo din�mico da classe pessoa e com isso n�o precisava criar v�rios m�todos de comer
		
		pessoa.comer(arroz, feijao, sorvete);
		
		System.out.println(pessoa.getPeso());

	}

}
