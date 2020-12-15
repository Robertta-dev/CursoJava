//Incluindo Classe abstract

public abstract class Conta {
		protected double saldo;
		protected int	agencia;
		protected int	numero;
		protected Cliente	titular;
		protected static int total = 0;
		
		public Conta(int agencia, int numero) {
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("Conta criada! Agencia: " + this.agencia + " Conta numero: " + this.numero); 
			Conta.total++;
			System.out.println("O total de contas abertas é: " + total);
		}
		
		public void deposita(double valor) {
			if(valor <= 0) {
				System.out.println("Não pode valores <= 0");
				return;
			}
			this.saldo = saldo += valor;
			System.out.println("Deposito efetuado! Saldo atual: " + this.saldo);
		}
		public boolean saca(double valor) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				System.out.println("Saque efetuado. Saldo atual: " + this.saldo);
				return true;
			}else {
				System.out.println("Saldo insuficiente. Saldo atual: " + this.saldo);
				return false;
			}
		}
		public boolean transfere(double valor, Conta destino) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				System.out.println("Transferencia realizada com Sucesso! Saldo restante: " + this.saldo);
				return true;
			}
			System.out.println("Tranferencia não realizada! Saldo insuficiente.");
			return false;
		}
		public double getSaldo() {
			return this.saldo;
		}
		public int getNumero() {
			return this.numero;
		}
		public void setNumero(int novoNumero) {
			if(novoNumero <= 0) {
				System.out.println("Não pode numeros <= 0");
				return;
				
			}
			this.numero = novoNumero;
		}
		public int getAgencia() {
			return this.agencia;
		}
		public void setAgencia(int novoAgencia) {
			if(novoAgencia <= 0) {
				System.out.println("Não pode numeros <= 0");
				return;
			}
			this.agencia = novoAgencia;
		}
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		public Cliente getTitular() {
			return this.titular;
		}
		
		public static int getTotal() {
			System.out.println("O total de contas abertas é: " + total);
			return Conta.total;
			
		}
	}
