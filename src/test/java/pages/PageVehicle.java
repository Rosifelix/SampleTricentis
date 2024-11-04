package pages;

import elementos.Elementos;
import metodo.Metodos;
import navegador.Navegador;

public class PageVehicle {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void acessarPagina(String url) {
		Navegador.iniciarTeste(url);
	
	}
		
	public void clicarAutomobile() {
			metodo.clicar(el.homeAutomobile);
		
	}
	// Dados do veículo
	public void preencherDadosVeiculo(String make, String performance, String manufacture, String numberOfSeats,
			String fuelType, String price, String annualMileage) {
		metodo.escrever(el.make, make);
		metodo.escrever(el.performance, performance);
		metodo.escrever(el.manufacture, manufacture);
		metodo.escrever(el.numberOfSeats, numberOfSeats);
		metodo.escrever(el.fuelType, fuelType);
		metodo.escrever(el.price, price);
		metodo.escrever(el.annualMileage, annualMileage);
		metodo.clicar(el.btnNext);

	}

}

