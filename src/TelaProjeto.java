public class TelaProjeto {

	private FabricaAbstrata fabricaAbstrata;
	private Janela janela;
	private Menu   menu;
	private Botao  botao;

	public void setFabrica(FabricaAbstrata fabricaAbstrata) {
		this.fabricaAbstrata = fabricaAbstrata;

	}

	public void montar() {
		this.janela = fabricaAbstrata.criarJanela();
		this.menu   = fabricaAbstrata.criarMenu();
		this.botao  = fabricaAbstrata.criarBotao();

	}

	public String desenhar() {
		return  this.janela.desenhar() + "{" + this.menu.desenhar() + ", " +  this.botao.desenhar() + "}";
		
		
	}

}
