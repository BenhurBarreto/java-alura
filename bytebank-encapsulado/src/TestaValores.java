
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		
		// a conta está inconsistente em relação à regra de negócio
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16549);
		
		Conta conta3 = new Conta(2112, 14660);
		
		System.out.println(Conta.getTotal());
	}
}
