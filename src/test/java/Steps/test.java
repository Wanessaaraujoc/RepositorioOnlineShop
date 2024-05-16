package Steps;

import Elementos.elementosTelaLogin;
import Metodos.metodosLoginPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;


public class test {
	
	elementosTelaLogin e = new elementosTelaLogin();
	metodosLoginPage m = new metodosLoginPage();

	
	
	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		m.abrirNavegador(string);
	    
	}

	@Quando("clicar para logar")
	public void clicar_para_logar() {
		m.clicar(e.getBtnLogar());
	    
	}

	@Quando("preencher login e senha incorretos")
	public void preencher_login_e_senha_incorretos() throws InterruptedException {
		m.preencherTexto(e.getCpUsuario(), "wanessacostaa2");
		m.pausar(3000);
		m.preencherTexto(e.getCpSenha(), "123456789");
	    
	}

	@Então("deverá aparecer a observação de login e senha incorretos")
	public void aparecerá_a_observação_de_login_e_senha_incorretos() {
		m.clicar(e.getBtnLogin());
		m.fecharNavegador();
	   
	}
}
