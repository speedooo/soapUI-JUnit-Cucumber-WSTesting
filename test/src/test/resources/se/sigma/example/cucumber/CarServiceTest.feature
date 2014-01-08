Feature: Daily car maintenance
  Cars need maintenance


Scenario: Fuelling
    Given a car with an empty gas tank
    When you fill it with 50 litres of fuel
    Then the tank contains 50 litres
