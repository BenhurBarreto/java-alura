
public class TestaBanco {
	public static void main(String[] args) {
		Cliente benhur = new Cliente();
		benhur.nome = "Benhur Banheira";
		benhur.cpf = "222.222.222-22";
		benhur.profissao = "Programador";
		
		Conta contaDoBenhur = new Conta();
		contaDoBenhur.deposita(100);
		
		contaDoBenhur.titular = benhur;
		System.out.println(contaDoBenhur.titular.nome);
	}
}
