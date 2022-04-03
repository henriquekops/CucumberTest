Feature: Welcome user
  
  After the user triggers root route it is expected that the server welcomes him 

  Scenario Outline: Server welcomes the user
    Given the user triggers "<route>" route
    Then the server status code should be "<status>"
    And the server should say "<answer>" 
  
  Examples:
    | route | status | answer   |
    | /     | 200    | Welcome! |