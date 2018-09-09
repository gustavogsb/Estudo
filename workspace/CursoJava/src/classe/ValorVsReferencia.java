package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		double numero = 1;
		Produto produto = new Produto("Caneta",1);
		Produto produto2 = produto;
		produto2.nome = "Lápis";
		//produto = new Produto(); //alocando um novo espaço de memória
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println("Produto: "+produto.nome +" \nPreço: "+ produto.preco);
	}
	
	static void porValor(double numero){//local de memória diferente da var numero criada no main
		numero ++;
	}
	
	static void porReferencia(Produto produto){//mesmo local da memória, está recebendo a referência do objeto
		produto.preco ++;
	}
}
