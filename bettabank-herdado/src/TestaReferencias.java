public class TestaReferencias {

	public static void main(String[] args) {

		Funcionario t1 = new Trainee();
		t1.setNome("Full Ana");
		t1.setSalario(2000);

		Analista a1 = new Analista();
		a1.setNome("Ana Listta");
		a1.setSalario(3000);

		Designer d1 = new Designer();
		d1.setNome("Desi Ree");
		d1.setSalario(4000);

		Gerente g1 = new Gerente();
		g1.setNome("Gerson");
		g1.setSalario(5000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(t1);
		controle.registra(a1);
		controle.registra(d1);
		controle.registra(g1);

		System.out.println(controle.getSoma());
		System.out.println(d1.nome);
	}
}
