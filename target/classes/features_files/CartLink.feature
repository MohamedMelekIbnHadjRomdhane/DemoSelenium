@CartLink
Feature: AffichageCartLink
  je souhaite me connecter à l application et ensuite j affiche le nombre de cartlink

  Scenario: je souhaite me connecter à l application et ensuite j affiche le nombre de cartlink
  
    Given J accede a l application SwagLabs
    When Je saisi le username "standard_user"
    When Je saisi le mot de passe "secret_sauce"
    When Je clique sur le bouton de connexion
    When  Je me redirige vers la page d acceuil "Products"
    And Je clique sur add to carte
    
  