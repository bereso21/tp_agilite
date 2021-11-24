@Test1
Feature: F001

  In order to use it
  As a user
  I want to create a new marin

  Scenario Outline: Creating a new Marin
    Given a <age>
    Then the personnage should be create
    Examples:
    | <age> |
    | 23    |

@Test2   
Feature: F002
	
	In order to use it
	As a user
	I want to create a new boat
	
	Scenario Outline: Creating a new bateau
		Given a boat
		And le nom est <nom>
		And le prix est <prix>
		Then creer le bateau
		Examples:
		| <nom>    | <prix> |
		| "Saphir" | 5000   |
		
		
@Test4		
Feature: F004

	In order to devenir propriétaire
	As a user
	I want to buy a boat for the marin
	
	Scenario Outline: Le bateau est trop cher
	Given a <marin>
	And a <nomBateau>
	When le marin veut acheter un bateau
	Then On doit verifier si le marin a assez d argent
	Examples:
	| <marin>      | <nomBateau> |
	| "Christophe" | "Saphir"    |
	
	Scenario Outline: Le marin devient proprietaire
	Given a <marin>
	And a <nomBateau>
	When le marin veut acheter un bateau
	Then Le marin devient proprietaire
	Examples:
	| <marin>      | <nomBateau> |
	| "Christophe" | "Saphir"    |
	
	