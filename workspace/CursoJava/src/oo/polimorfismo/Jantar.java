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
		// vai dar ERRO pq a pessoa não está preparada para comer sorvete. Polimorfismo estático(preso ao código)
		//Tive que criar um método de comer sorvete na classe pessoa para fincionar
		////pessoa.comer(sorvete);
		
		//depois eu implementei o polimorfismo dinâmico da classe pessoa e com isso não precisava criar vários métodos de comer
		
		pessoa.comer(arroz, feijao, sorvete);
		
		System.out.println(pessoa.getPeso());

	}

}
