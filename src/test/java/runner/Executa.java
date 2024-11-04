package runner
;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", // Caminho dos gherkins
		glue = "steps", // Caminho da class Java que implementa os gherkins
		tags = "@seguroAutomovel", // Indica qual ou quais testes serão executados
		dryRun = false, // TRUE estou planejando, FALSE estou executando
		monochrome = false, // Remove os caracteres especiais do terminal
		snippets = SnippetType.CAMELCASE, // Configura os métodos no padrão Java sem _
		plugin = { "pretty", // Deixa o nosso console bonito no padrão cucumber
				"html:target/cucumber-reports.html", // Gera um relatório html
			
		}

)

public class Executa {

	
}
