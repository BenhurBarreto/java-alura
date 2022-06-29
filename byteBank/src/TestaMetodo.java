
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoBenhur = new Conta();
		contaDoBenhur.saldo = 100;
		contaDoBenhur.deposita(50);
		System.out.println(contaDoBenhur.saldo);
		
		boolean conseguiuRetirar = contaDoBenhur.saca(20);
		System.out.println(contaDoBenhur.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoBenhur);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoBenhur.saldo);
		
		contaDoBenhur.titular = "Benhur Banheira";
		System.out.println(contaDoBenhur.titular);
	}
}
