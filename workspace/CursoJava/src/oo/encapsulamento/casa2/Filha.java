package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra	{

		String segredoDoCasal = "Meu marido está quase sendo demitido"; //Default ou Pacote
		
		public static void main(String[] args) {
			
			Filha euMesma = new Filha();
			System.out.println("Meus pais não sabem... " + euMesma.segredoDoCasal);
			
			//Genro meuAmor = new Genro();
			//System.out.println(meuAmor.segredo); //Não consigo acessar pq é privado
			
			Sogro papai = new Sogro();
			System.out.println(papai.gostaDeCerveja);
			
			//Atributos protected são passados por herança
			//Sogra mamae = new Sogra();
			//System.out.println(mamae.segredoDeFamilia); //Não consigo pq não está no mesmo pacote 
			System.out.println(euMesma.segredoDeFamilia);
		}
}	
