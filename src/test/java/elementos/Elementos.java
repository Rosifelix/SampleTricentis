package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Dados do veículo
	public By homeAutomobile = By.id("nav_automobile");
	public By make = By.id("make");
	public By performance = By.id("engineperformance");
	public By manufacture = By.id("dateofmanufacture");
	public By numberOfSeats = By.id("numberofseats");
	public By fuelType = By.id("fuel");
	public By price = By.id("listprice");
	public By annualMileage = By.id("annualmileage");
	public By btnNext = By.id("nextenterinsurantdata");

	// Dados do seguro
	public By firstName = By.id("firstname");
	public By lastName = By.id("lastname");
	public By dateOfBirth = By.id("birthdate");
    public By genderfemale = By.xpath("//*[text()='Male']/span");	
    public By gendermale = By.xpath("//*[text()='Female']/span");	
	public By country = By.id("country");
	public By zipeCode = By.id("zipcode");
	public By occupation = By.id("occupation");
	public By speeding = By.xpath("//*[text()=' Speeding']/span");
	public By bungeejumping = By.xpath("//*[text()=' Bungee Jumping']/span");
	public By cliffdiving = By.xpath("//*[text()=' Cliff Diving']/span");
	public By skydiving = By.xpath("//*[text()=' Skydiving']/span");
	public By other = By.xpath("//*[text()=' Other']/span");
	public By btnNextProduct = By.id("nextenterproductdata");

	// Dados do Produto
	public By startDate = By.id("startdate");
	public By insuranceSum = By.id("insurancesum");
	public By meritRating = By.id("meritrating");
	public By damageInsurance = By.id("damageinsurance");
	public By optionalProducts = By.xpath("//*[text()='Euro Protection']/span");
	public By courtesyCar = By.id("courtesycar");
	public By btnNextPrice = By.id("nextselectpriceoption");
	
	// Opção de preço
	public By opcaoPreco = By.xpath("//input[@id='selectultimate']/parent::label");
	public By btnNextOpcao = By.id("nextsendquote");
	
	
	//Enviar Cotação


    public By email = By.id("email");
    public By username = By.id("username");
    public By password = By.id("password");
    public By confPassword = By.id("confirmpassword");
    public By btnSend = By.id("sendemail");

	
	
}
