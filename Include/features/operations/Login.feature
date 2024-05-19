Feature: Login

  Scenario Outline: Test Login
    Given User Navigates to home page
    When User Enters <username> and <password>
    Then User is navigated to Home Page <result>

    Examples: 
      | username         | password          | result     |
      | ikram.gharsallah | Msdos@12345678901 | Dashboards |
