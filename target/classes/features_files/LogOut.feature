@LogOut
Feature: LogOut
 je souhaite me connecter a l application et ensuite je deconnecte

  Scenario: je souhaite me connecter a l application et ensuite je deconnecte
  
   Given J accede a l application SwagLabs
    When Je saisi le username "standard_user"
    When Je saisi le mot de passe "secret_sauce"
    When Je clique sur le bouton de connexion
    And  Je me redirige vers la page d acceuil "Products"
    And Je clique sur menu de SwagLabs 
    Then Je clique sur le bouton Logout