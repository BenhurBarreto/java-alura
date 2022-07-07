
public class EditorVideo extends Funcionario {
		
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor de Vídeo");
		return super.getBonificacao() + 100;
	}
}
