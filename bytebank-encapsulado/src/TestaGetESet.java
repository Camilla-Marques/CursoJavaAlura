
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente camilla = new Cliente();
		
		camilla.setNome("Camilla Marques");
		
		conta.setTitular(camilla);
		
		System.out.println(conta.getTitular().getNome());
		
	}
}
