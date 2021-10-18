Feature: Openin a lesson worksheet page
 
  Scenario: The happy scenario of opening lesson worksheet
    Given User opens Nagwa website
    When User selects english language
    And Search for a lesson as "Addition" 
    And Choose the second lesson from the results
    And Click on the lesson worksheet
    Then User should navigate to the worksheetpage
    And Count the number of displayed questions