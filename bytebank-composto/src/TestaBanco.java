
public class TestaBanco {
	public static void main(String[] args) {
		Cliente camilla = new Cliente();
		camilla.nome = "Camilla Marques";
		camilla.cpf = "233.945.678-90";
		camilla.profissao = "programadora"; 
		
		Conta contaDaCamilla = new Conta();
		contaDaCamilla.deposita(100);
		
		// associa a cliente camilla a conta contaDaCamilla
		contaDaCamilla.titular = camilla;
		System.out.println(contaDaCamilla.titular.nome);
	}
}
