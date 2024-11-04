package navegador;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.cucumber.java.Before;

public class Navegador extends Drivers {

	@Before
	public static void iniciarTeste(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
}