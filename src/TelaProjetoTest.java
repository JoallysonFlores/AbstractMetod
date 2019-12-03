import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TelaProjetoTest {
	
    @Test
	public void test() {
		TelaProjeto  tela = new TelaProjeto();
		tela.setFabrica(new FabricaWindows());
		tela.montar();
		tela.desenhar();
		assertEquals("janela windows{Menu windows, botão windows}",tela.desenhar());
		
	}
	

	
}