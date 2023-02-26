Feature: Login as admin to topupaja
  Scenario: I want login as admin topupaja
    Given  I open topupaja
    When Input Username and password
    And Click login
    Then Showing admin dashboard