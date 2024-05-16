package Elementos;

import org.openqa.selenium.By;

public class elementosTelaLogin {
	
	private By btnLogar = By.id("bfeee1c");
	
	private By cpUsuario = By.id("username");
	
	private By cpSenha = By.name("password");
	
	private By btnLogin = By.id("submit");

	public By getBtnLogar() {
		return btnLogar;
	}

	public By getCpUsuario() {
		return cpUsuario;
	}

	public By getCpSenha() {
		return cpSenha;
	}

	public By getBtnLogin() {
		return btnLogin;
	}
	
	
		

}
