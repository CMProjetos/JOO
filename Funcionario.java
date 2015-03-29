class Funcionario{
	
	
	String departamento;
	String nome;
	String dataDeEntrada;
	String rg;
	double salario;
	boolean estaNaEmpresa;
	
	void recebeAumento (double aumento){
		this.salario += aumento;
	}
		
	double calculaGanhoAnual() {
		return this.salario*12;
	}
	
	void mostra () {
		System.out.println(departamento + "\n" + nome + "\n" + dataDeEntrada + "\n" + rg + "\n" + salario + "\n" + estaNaEmpresa);
	}
	
	double dataDeEntrada (double dataDeEntrada){
		return this.dataDeEntrada = dia + mes + ano;
		
	}
}

class Data {
	int dia, mes, ano;
	
}

class TestaFuncionario {
	public static void main (String [] args){
	Funcionario f1 = new Funcionario();
	/*
	f1.departamento = "setor 2";
	f1.nome = "Miguel";
	f1.dataDeEntrada = "dezembro";
	f1.rg = "123456789-10";
	f1.salario = 100;
	f1.estaNaEmpresa = true;
	f1.recebeAumento(50);
	*/
	f1.nome = "Miguel";
	f1.salario = 100;
	
	f1.mostra();
	
	System.out.println("salario atual e de: " + f1.salario);
	System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
	
	Funcionario f2 = f1;
	System.out.println(f2.nome);
	f2.nome = "Danilo";
	f2.salario = 100;
	System.out.println(f1.nome);
	
	if (f1 == f2) {
		System.out.println	("iguais");
		
	}else {
		System.out.println("diferentes");
	}
	
	Data dataDeEntrada = Data();
	System.out.println("Data de entrada foi: " + dataDeEntrada.dataDeEntrada);
	}
}
