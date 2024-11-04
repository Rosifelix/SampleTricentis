package pages;

import elementos.Elementos;
import metodo.Metodos;


public class PageProduct {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();


	// Dados do Produto
		public void preencherDadosProdutos(String startDate, String insuranceSum, String meritRating ,String damageInsurance, String optionalProducts,String courtesyCar ) {
			metodo.escrever(el.startDate, startDate);
			metodo.escrever(el.insuranceSum, insuranceSum);
			metodo.escrever(el.meritRating, meritRating);
		    metodo.escrever(el.damageInsurance, damageInsurance);
		    metodo.clicar(el.optionalProducts);
		    metodo.escrever(el.courtesyCar, courtesyCar);
			metodo.clicar(el.btnNextPrice);
		}
	
}
