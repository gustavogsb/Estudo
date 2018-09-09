package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra	{

		String segredoDoCasal = "Meu marido est� quase sendo demitido"; //Default ou Pacote
		
		public static void main(String[] args) {
			
			Filha euMesma = new Filha();
			System.out.println("Meus pais n�o sabem... " + euMesma.segredoDoCasal);
			
			//Genro meuAmor = new Genro();
			//System.out.println(meuAmor.segredo); //N�o consigo acessar pq � privado
			
			Sogro papai = new Sogro();
			System.out.println(papai.gostaDeCerveja);
			
			//Atributos protected s�o passados por heran�a
			//Sogra mamae = new Sogra();
			//System.out.println(mamae.segredoDeFamilia); //N�o consigo pq n�o est� no mesmo pacote 
			System.out.println(euMesma.segredoDeFamilia);
		}
}	
