package classe;

public class VariaveisLocais {
	//Variável de Instância: Na classe primeiro a JVM lê as variáveis, portanto pode declara no início ou no fim
	int a = 2;
	
	//Variáveis locais: Dentro do método a execução é serial, tem que declarar para depois usar
	void teste1(){
		int a1 = 2;
		System.out.println(a);
		
		if(a1 > 1){
			//escopo de bloco, só é lida aqui dentro
			int a2 = 3;
		}
		//System.out.println(a2); //Não está disponível pois foi definida dentro do bloco IF
	}
}
