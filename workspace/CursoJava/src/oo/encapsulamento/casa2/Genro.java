package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {

		private String segredo = "Minha sogra fala demais!"; //Vari�vel de inst�ncia
		
		public static void main(String[] args) {
				
			Genro euMesmo = new Genro();
			System.out.println("Nunca falarei... " + euMesmo.segredo);
			
			Filha meuAmor = new Filha();
			System.out.println(meuAmor.segredoDoCasal);
			
			Sogro sograo = new Sogro();
			System.out.println(sograo.gostaDeCerveja);
			
			//Sogra sogrinha = new Sogra();
			//System.out.println(sogrinha.segredoDeFamilia); //N�o consigo pq � protected em pacote diferente e nem recebo por heran�a
			
		}
}
