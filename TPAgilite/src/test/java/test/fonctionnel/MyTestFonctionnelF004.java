package test.fonctionnel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import main.Marin;
import main.Bateau;

public class MyTestFonctionnelF004 {
	
	private Marin marin1;
	private Bateau bateau1;
	
	@Given("^Christophe achete le bateau (.*) de valeur (\\d+)$")
  public void AchatDuBateau(String nomBateau, int valeur) {
		Bateau bateau1 = new Bateau(nomBateau, valeur);
		Marin marin1 = new Marin();
		marin1.achatBateau(bateau1);
  }
	@Then("^DoitAvoirAssezDArgent$")
	public void OnVerfiLePortefeuille(int valeur) {
		double argentMarin = marin1.getPortefeuille();
		Assert.assertTrue(argentMarin > valeur);
	}

}

}
