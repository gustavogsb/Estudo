package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {

		private String segredo = "Minha sogra fala demais!"; //Variável de instância
		
		public static void main(String[] args) {
				
			Genro euMesmo = new Genro();
			System.out.println("Nunca falarei... " + euMesmo.segredo);
			
			Filha meuAmor = new Filha();
			System.out.println(meuAmor.segredoDoCasal);
			
			Sogro sograo = new Sogro();
			System.out.println(sograo.gostaDeCerveja);
			
			//Sogra sogrinha = new Sogra();
			//System.out.println(sogrinha.segredoDeFamilia); //Não consigo pq é protected em pacote diferente e nem recebo por herança
			
		}
}
