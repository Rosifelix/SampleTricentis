package pages;




import drivers.Drivers;
import elementos.Elementos;
import metodo.Metodos;

public class PageSelectPrice extends Drivers {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	// Opção de Preço
	public void opcaoPreco() {
		
		metodo.clicar(el.opcaoPreco);
		metodo.aguardarElemento(el.btnNextOpcao);
		metodo.clicar(el.btnNextOpcao);
		
		

        
	}

}
