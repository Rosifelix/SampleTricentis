package metodo;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		try {
	        driver.findElement(elemento).click(); // Tenta o clique convencional
	    } catch (ElementClickInterceptedException e) {
	        // Usa o JavascriptExecutor para forçar o clique se o elemento estiver oculto ou sobreposto
	        WebElement element = driver.findElement(elemento);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	    }
		
	    }

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void localizarElemento(By elemento) {
		// Localizando o span sobre o radio button feminino e clicando nele
		WebElement femaleOption = driver.findElement(By.cssSelector("span.ideal-radio"));
		femaleOption.click();
	}


	public void aguardarElemento(By nome) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(nome));
	}


	}

	
	


