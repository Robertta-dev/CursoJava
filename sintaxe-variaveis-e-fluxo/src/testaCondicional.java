
public class testaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais.");

		int idade = 18;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
			System.out.println("outro");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você pode entrar companhado!");
			}else {
				System.out.println("Você não pode entrar!");
			}
			
		}
	}
}
