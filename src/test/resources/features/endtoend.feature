Feature: Demo Web Shop E2E

  Scenario: Register via api and Login via ui
    Given user is registered using API
    When user logs in using UI
    Then test should be successful