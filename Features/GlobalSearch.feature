Feature: Check Global Search

  Scenario: Verify Golbal Search functioanlities
    Given Open the browser for search
    When Load the home page URL for search
    And  Perform Global Search
    Then Search results should display
