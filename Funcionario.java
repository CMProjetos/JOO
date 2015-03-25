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
}

class TestaFuncionario {
	Funcioario f1 = new Funcioario();
	
	f1.nome = "Hugo";
	f1.salario = 100;
	f1.recebeAumento(50);
	
	System.out.println("salario atua e de: " + f1.salario);
}
