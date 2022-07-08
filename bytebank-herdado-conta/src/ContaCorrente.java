
public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);// chama o construtor da classe mãe
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
