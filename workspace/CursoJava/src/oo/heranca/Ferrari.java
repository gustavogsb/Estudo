package oo.heranca;

public class Ferrari  extends Carro {
	
	public Ferrari(){
		VELOCIDADE_MAXIMA = 350;
	}
	
	//Sobrecrevendo o método acelerar da classe pai
	public void acelerar(){
		//super.acelecar(); // para diferenciar que está chamando da classe pai
		super.acelerarMais(20); // Aqui não precisava ter SUPER, pois não tenho nenhum método acelerarMais aqui em Ferrari
	}

}
