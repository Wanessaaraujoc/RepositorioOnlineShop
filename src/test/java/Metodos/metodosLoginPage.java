package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodosLoginPage {

	WebDriver web;
	
	
	public void abrirNavegador(String url) {
		System.setProperty("webDriver.chrome.driver", "./Driver/chromedriver.exe");
		web = new ChromeDriver();
		web.manage().window().maximize();
		web.get(url);		
	}
	
	public void clicar(By elemento) {
		web.findElement(elemento).click();
		
	}
	
	public void pausar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
		
	}
	
	public void preencherTexto(By elemento , String texto) {
		web.findElement(elemento).sendKeys(texto);
		
	}
	
	public void fecharNavegador() {
		web.quit();
	}
	
	
}

