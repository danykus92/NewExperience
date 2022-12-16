#Author: Daniel Sanchez
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with automation course
  @AddTShirtToCart @Cases
  Scenario: Buscar ropa nueva y comprarla
    Given que Daniel quiere comprar en New Experience
    When busca ropa nueva para el
    Then agrego con exito un nuevo producto en la caja
      |strAnswer|
      |Faded Short Sleeve T-shirts|

  @AddTwoProductsAndRegisterAnUserToBuy @Cases
  Scenario: Busqueda de nuevos productos, registro y compra
    Given que Daniel quiere comprar en New Experience
    When compra productos en dos secciones y se registra para realizar el pago completo
      |strName|strLastName|strPassword|strAddress|strCity|strState|strZIP|strPhone|
      |Daniel|Sanchez|dsg0209|La Granja|Monteria|Texas|12345|3201234567|
    Then el hace un pago exitoso
      |strAnswer2|
      |Your order on My Store is complete.|