package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	
	Data(){
		
	}
	
/*  //this() representa um dos construtores, nesse caso o único	
	Data(){
	 this(1,1,2017);	
	}	
*/	
	//this representa o objeto atual
	Data(int dia, int mes, int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatar(){
		
		return String.format("%d/%d/%d",dia, mes, ano);
	}
}
