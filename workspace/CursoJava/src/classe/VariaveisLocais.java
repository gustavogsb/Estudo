package classe;

public class VariaveisLocais {
	//Vari�vel de Inst�ncia: Na classe primeiro a JVM l� as vari�veis, portanto pode declara no in�cio ou no fim
	int a = 2;
	
	//Vari�veis locais: Dentro do m�todo a execu��o � serial, tem que declarar para depois usar
	void teste1(){
		int a1 = 2;
		System.out.println(a);
		
		if(a1 > 1){
			//escopo de bloco, s� � lida aqui dentro
			int a2 = 3;
		}
		//System.out.println(a2); //N�o est� dispon�vel pois foi definida dentro do bloco IF
	}
}
