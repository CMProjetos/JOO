class Conta {
	int numero = 1234;
	String dono = "Duke";
	String cpf = "123.456.789-10"
	double saldo = 1000;
	double limite = 1000;
	double salario;
	
	void deposita(double quantidade){
		this.saldo += quantidade;
		}
	
	boolean saca (double valor) {
		if (this.saldo < valor) {
			return false;
			
		}
		
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	void tranfere (Conta destino, double valor){
		this.saldo = this.saldo = valor;
		destino.saldo = destino.saldo + valor
	}
}

class TestaMetodos{
	public static void main (String [] args){
		Conta minhaConta;
		minhaConta = new Conta ();
		
		
		minhaConta.dono = "Duke";
		minhaConta.saldo = 10000;
		
		
		minhaConta.saca(200);
		
		minhaConta.deposita(500);
		System.out.println(minhaConta.saldo);
	

		minhaConta.saldo = 10000;
		
		if   (minhaConta.saca(2000)){
			System.out.println("consegui sacar: " + minhaConta.saldo);
		} else {
			System.out.println("Não consegui");
		}
		
	}
}

class TestaDuasContas {
	public static void main (String [] args){
		
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.saldo = 1000;
		
		Conta meuSonho;
		meuSonho = new Conta ();
		meuSonho.saldo = 150000;
		
	}
	
}

class TestaReferencia {
	public static void main (String [] args){
		Conta c1 = new Conta();
		c1.deposita(100);
		
		Conta c2 = c1 ;
		c2.deposita(200);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		
	}
}



class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
			
		minhaConta.dono = "Duke";
		minhaConta.saldo = 10000.0;
		
		System.out.println("Saldo atual: " + minhaConta.saldo); 
	}
	
	
}