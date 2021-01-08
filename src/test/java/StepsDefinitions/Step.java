package StepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

WebDriver driver;
By seccionEmpleos = By.linkText("Empleos");
By SeccionEmpleosAcced = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/img");
By Keywords = By.id("search_keywords");
By Location = By.name("search_location");
By Enlace = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[10]/div/div/div[1]/div/div/div/div/div/ul[1]/li[1]/a");

By Searhjob = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input");

@Given("Selecciona algun enlace dentro de la seccion Preparados para Aplicar")
public void selecciona_algun_enlace_dentro_de_la_seccion_Preparados_para_Aplicar() {
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.choucairtesting.com/");
}


@When("Hace click sobre alguno de ello")
public void hace_click_sobre_alguno_de_ello() throws InterruptedException {
	driver.findElement(seccionEmpleos).click();
	Thread.sleep(1000);
	if(driver.findElement(SeccionEmpleosAcced).isDisplayed()) {
		driver.findElement(Enlace);
	}
	else {
		System.out.print("Sección de Emplos no encontrado");
	}

	
	
}


@Then("Muestra la ventana con la informacion referente al enlace")
public void muestra_la_ventana_con_la_informacion_referente_al_enlace() {
 
}

}
