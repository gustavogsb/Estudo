package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.nome 	= "Notebook ACER 15' 8GB";
		produto1.preco 	= 2300;
		//produto1.desconto = 0.15;
		
		
		Produto produto2 = new Produto("Caneta BIC preta", 2.83);
		
		Produto.descontoFixo = 0.15;
		
		System.out.println(produto1.precoComDescontoFixo());
		System.out.println(produto2.precoComDescontoFixo());
	}

}
