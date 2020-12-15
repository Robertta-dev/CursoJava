

public class TesteFuncionario {
	
	public static void main(String[] args) {
	
		Funcionario renan = new Trainee();
		renan.setNome("Renan");
		renan.setCpf("00000099900");
		renan.setSalario(2000);
		
		
		System.out.println(renan.getNome());
		System.out.println(renan.getBonificacao());
		
	}

}
