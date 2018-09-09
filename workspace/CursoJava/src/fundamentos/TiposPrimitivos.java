package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipos primitivos booleanos
		boolean bol1 = false;
		boolean bol2 = true;
		System.out.printf("%b %b \n", bol1,bol2);

		//Tipos primitivos caractere
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050'; //caracter unicode
		
		System.out.printf("%c %c %c \n",c1,c2,c3);
		
		//Tipos primitivos inteiros
		byte b = 127; //[+127 a -128]
		short s = 32767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;
		
		System.out.printf("%d %d %d %d\n", b,s,i,l);
		
		//imprimir no formato binário
		System.out.println(Integer.toBinaryString(b)); //1 byte
		System.out.println(Integer.toBinaryString(s)); //2 bytes
		System.out.println(Integer.toBinaryString(i)); //4 bytes
		System.out.println(Long.toBinaryString(l));	   //8 bytes
		
		//Tipos primitivos reais
		float f = 3.1416f;
		double d = 2.45;
		
		System.out.printf("%.2f %.1f",f,d);
	}

}
