package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDaCamilla = new Conta();
		contaDaCamilla.saldo = 100;
		contaDaCamilla.deposita(50);
		
		System.out.println(contaDaCamilla.saldo);
		
		boolean conseguiuRetirar = contaDaCamilla.saca(20);
		System.out.println(contaDaCamilla.saldo);
		System.out.println(conseguiuRetirar);	
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaCamilla);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesso!");
		}else {
			System.out.println("Faltou dinheiro.");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaCamilla.saldo);
		
		contaDaCamilla.titular = "Camilla Marques";
		System.out.println(contaDaCamilla.titular);
	}

}
