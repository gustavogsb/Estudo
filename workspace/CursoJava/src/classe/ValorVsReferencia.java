package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		double numero = 1;
		Produto produto = new Produto("Caneta",1);
		Produto produto2 = produto;
		produto2.nome = "L�pis";
		//produto = new Produto(); //alocando um novo espa�o de mem�ria
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println("Produto: "+produto.nome +" \nPre�o: "+ produto.preco);
	}
	
	static void porValor(double numero){//local de mem�ria diferente da var numero criada no main
		numero ++;
	}
	
	static void porReferencia(Produto produto){//mesmo local da mem�ria, est� recebendo a refer�ncia do objeto
		produto.preco ++;
	}
}
