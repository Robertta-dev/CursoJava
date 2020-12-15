
public class TesteSistema {

	public static void main(String[] args) {


		Gerente g = new Gerente();
		g.setSenha(5555);
		
		Administrador adm = new Administrador();
		adm.setSenha(1234);
		
		Autenticavel referencia	= new Gerente();
		referencia.setSenha(54544);
				
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(referencia);
		

	}
}
