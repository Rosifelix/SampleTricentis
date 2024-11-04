package steps;



import drivers.Drivers;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import pages.PageInsurant;
import pages.PageProduct;
import pages.PageSelectPrice;
import pages.PageSendQuote;
import pages.PageVehicle;

public class AutomobileTeste extends Drivers {

	PageVehicle pageVe = new PageVehicle();
	PageInsurant pageIn = new PageInsurant();
	PageProduct pageProd = new PageProduct();
	PageSelectPrice pagePrice = new PageSelectPrice();
	PageSendQuote pageQuote = new PageSendQuote();

	@Dado("que acesso o site {string}")
	public void queAcessoOSite(String url) {
		pageVe.acessarPagina(url);

	}

	@Quando("clicar em automobile")
	public void clicarEmAutomobile() {
		pageVe.clicarAutomobile();

	}

	@Quando("informar dados do veículo")
	public void informarDadosDoVeículo() {
		pageVe.preencherDadosVeiculo("Audi", "10", "10/05/2000", "2", "Petrol", "600", "800");

	}

	@Quando("informar dados do segurador")
	public void informarDadosDoSegurador() {
		pageIn.preencherDadosSeguro("Aurora", "Felix", "02/05/1988", "Female", "Brazil", "09682100", "Farmer", "Bungee Jumping");

	}

	@Quando("informar dados do produto")
	public void informarDadosDoProduto() {
		pageProd.preencherDadosProdutos("02/02/2025", "15000000", "Bonus 5", "Full Coverage", "Euro Protection", " Yes");

	}

	@Quando("selecionar opção de preço")
	public void selecionarOpçãoDePreço() {
		pagePrice.opcaoPreco();
	
	}

	@Então("o sistema realiza a cotação desejada")
	public void oSistemaRealizaACotaçãoDesejada() {
	    pageQuote.enviarCotacao("felix.aurora@teste.com", "Aurora", "A@f123654", "A@f123654");

	}

}