@MYtest
Feature: Homepage to Dora scenario
  
  As a user
  I want to go the carsguide website 
  and hit the search button should take me to the DORA

  Scenario: Homepage to Dora scenario
    Given I open the URL on Chrome
    And I hit search
    Then Dora page should be loaded

    