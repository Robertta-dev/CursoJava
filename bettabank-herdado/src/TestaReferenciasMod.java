	public class TestaReferenciasMod {

		public static void main(String[] args) {
		
		FuncionarioMod f1 = new FuncionarioMod("Full Ana", "12345678909", 1000);
		//f1.setNome("Full Ana");
		//f1.setSalario(2000);
		
		Analista a1 = new Analista("Ana Listta", "23412345678", 2000);
		//a1.setNome("Ana Listta");
		//a1.setSalario(3000);
		
		Designer d1 = new Designer("Desi Ree", "78967856798", 3000);
		//d1.setNome("Desi Ree");
		//d1.setSalario(4000);
		
		Gerente g1 = new Gerente("Gerson T.", "56745676589", 4000);
		//g1.setNome("Gerson");
		//g1.setSalario(5000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(f1);
		controle.registra(a1);
		controle.registra(d1);
		controle.registra(g1);
		
		System.out.println(controle.getSoma());
		}
	}
