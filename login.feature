 Feature: feature to test login functionality.

 Scenario: check login successfully with valid credentials.

   Given user is on login Page.

   When user enters user name and password.

   And clicks on login button

   Then user is navigated to the homepage.


   Scenario Outline: check login successfully with valid credentials.

     Given user is on login Page.

     When user enters "<username>" and "<password>".

     And clicks on login button

     Then user is navigated to the homepage.
     Examples:
       | username | password |
       | user1    | pass1    |
       | user2    | pass2    |




