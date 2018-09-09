package oo.polimorfismo;

public class Pessoa {

	/**
	 * Peso em KG
	 */
	private double peso = 0;
	
	public Pessoa(double pesoInicial){
		this.peso = pesoInicial;
	}
	
	public double getPeso(){
		return peso;
	}
	
	//Polimorfismo estático ou Sobrecarga de método
	//Mesmo nome com assinaturas diferentes
/*	
	public void comer(Arroz arroz){
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao feijao){
		this.peso += feijao.getPeso();
	}
	
	public void comer(Sorvete sorvete){
		this.peso += sorvete.getPeso();
	}	
*/	
	//polimorfismo dinâmico
/*	
	public void comer(Comida comida){
		this.peso += comida.getPeso();
	}	
*/	
	//implementando varargs
	public void comer(Comida... comidas){
		for(Comida c: comidas){
			this.peso += c.getPeso();
		}
	}
	
	
}
