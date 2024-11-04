package pages;

import elementos.Elementos;
import metodo.Metodos;

public class PageInsurant {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	     // Dados do seguro
	public void preencherDadosSeguro(String firstName, String lastName, String dateOfBirth, String gender,
			String country, String zipeCode, String occupation, String hobbies) {
		metodo.escrever(el.firstName, firstName);
		metodo.escrever(el.lastName, lastName);
		metodo.escrever(el.dateOfBirth, dateOfBirth);
		// Selecionando gênero
		if (gender.equalsIgnoreCase("Female")) {
			metodo.clicar(el.gendermale);
		} else {
			metodo.clicar(el.genderfemale);
		}

		metodo.escrever(el.country, country);
		metodo.escrever(el.zipeCode, zipeCode);
		metodo.escrever(el.occupation, occupation);
		
		// Selecionando hobbies usando if-else com espera explícita para todos os elmentos
		if (hobbies.equalsIgnoreCase("speeding")) {
			metodo.aguardarElemento(el.speeding); 
			metodo.clicar(el.speeding);
		} else if (hobbies.equalsIgnoreCase("bungeejumping")) {
			metodo.aguardarElemento(el.bungeejumping); 
			metodo.clicar(el.bungeejumping);
		} else if (hobbies.equalsIgnoreCase("cliffdiving")) {
			metodo.aguardarElemento(el.cliffdiving); 
			metodo.clicar(el.cliffdiving);
		} else if (hobbies.equalsIgnoreCase("skydiving")) {
			metodo.aguardarElemento(el.skydiving); 
			metodo.clicar(el.skydiving);
		} else {
			metodo.aguardarElemento(el.other); 
			metodo.clicar(el.other);

		}
		metodo.aguardarElemento(el.btnNextProduct);
		metodo.clicar(el.btnNextProduct);

	}
}