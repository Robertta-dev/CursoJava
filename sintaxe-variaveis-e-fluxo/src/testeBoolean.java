
public class testeBoolean {
	public static void main(String[] args) {
		System.out.println("Testando condicionais.");

		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor acompanhado = " + quantidadePessoas);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Você não pode entrar!");
		}
		
		

	}
}
