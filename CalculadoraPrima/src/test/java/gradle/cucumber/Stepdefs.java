package gradle.cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import CalculadoraPrima.*;

public class Stepdefs {
	private int edad;
    private int puntos;
    private double prima;
  

	@When("El vendedor calcula el valor de prima")
	public void el_vendedor_calcula_el_valor_de_prima() {
	    // Write code here that turns the phrase above into concrete actions
        prima = new Prima(edad, puntos).calculoPrima();
	}

	@Then("La prima es {int}")
	public void la_prima_es(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
    	assertEquals(int1, prima, 0);
	}


	
	@Given("El cliente tiene {int} anios con {int} puntos")
	public void el_cliente_tiene_anios_con_puntos(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
		edad = int1;
        puntos = int2;
	}

	@Given("El cliente tiene {int} anios con {int} puntos, tiene los puntos completos")
	public void el_cliente_tiene_anios_con_puntos_tiene_los_puntos_completos(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
		edad = int1;
        puntos = int2;	}
}
