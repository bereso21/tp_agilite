package test.fonctionnel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import main.Marin;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class MyTestFonctionnelF001 {
	
	private Marin marin1;
	
	@Given("^Christophe a un age de (\\d+)$")
  public void leMarinAunAgeDe(int age) {
	  Marin marin1 = new Marin(age);
  }
	@Then("^AgedoitEtreVerifier soit (\\d+)$")
	public void OnverfifieLage(int age) {
		Assert.assertEquals(marin1.getAge(), age);
	}

}

