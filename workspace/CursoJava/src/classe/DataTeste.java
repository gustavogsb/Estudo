package classe;

public class DataTeste {

	public static void main(String[] args) {

		//Maneira 1
		Data nascimento = new Data();
		
		nascimento.dia = 19;
		nascimento.mes = 8;
		nascimento.ano = 1977;
	
		//Maneria 2
		Data casamento = new Data(20,1,2006);
		
		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
		
		//System.out.println(nascimento.dia+"/"+nascimento.mes+"/"+nascimento.ano);
		
		//System.out.printf("%d/%d/%d",nascimento.dia, nascimento.mes, nascimento.ano);

	}

}
