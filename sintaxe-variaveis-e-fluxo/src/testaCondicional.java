
public class testaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais.");

		int idade = 18;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!");
			System.out.println("outro");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� pode entrar companhado!");
			}else {
				System.out.println("Voc� n�o pode entrar!");
			}
			
		}
	}
}
