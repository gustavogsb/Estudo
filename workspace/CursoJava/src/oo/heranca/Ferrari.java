package oo.heranca;

public class Ferrari  extends Carro {
	
	public Ferrari(){
		VELOCIDADE_MAXIMA = 350;
	}
	
	//Sobrecrevendo o m�todo acelerar da classe pai
	public void acelerar(){
		//super.acelecar(); // para diferenciar que est� chamando da classe pai
		super.acelerarMais(20); // Aqui n�o precisava ter SUPER, pois n�o tenho nenhum m�todo acelerarMais aqui em Ferrari
	}

}
