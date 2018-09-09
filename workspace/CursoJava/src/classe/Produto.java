package classe;

public class Produto {

		String nome;
		double preco;
		double desconto;
		static double descontoFixo;
		
		Produto(){
			
		}
		
		Produto(String nome, double preco){
			this.nome 		= nome;
			this.preco 		= preco;
			//this.desconto 	= desconto;
		}
		
		double precoComDesconto(){
			return preco - preco * desconto;
		}
		
		
		double precoComDescontoFixo(){
			return preco - preco * descontoFixo;
		}		
}
