package pages;

import elementos.Elementos;
import metodo.Metodos;

public class PageSendQuote {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	// Enviar Cotação com validação de preenchimento e tratamento de exceções
	public void enviarCotacao(String email, String username, String password, String confPassword) {
			metodo.escrever(el.email, email);
			metodo.escrever(el.username, username);
			metodo.escrever(el.password, password);
			metodo.escrever(el.confPassword, confPassword);
			metodo.clicar(el.btnSend);
		
		
	}
}
