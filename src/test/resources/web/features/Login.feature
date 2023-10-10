
Feature: LogIn

  @SuccessfulLogIn @TestCase1
  Scenario: Successful LogIn
    Given the client enters the MyAccount page
    When  the client logs in successfully
    Then access the MyAccountPage-Dashboard after clicking the button:LOGIN

  @FailedLogIn  @TestCase2-5
  Scenario Outline: Failed LogIn by <motive>
    Given the client enters the MyAccount page
    When  the client enters <user> and <password> on the logIn section
    Then a <warning> is shown

    @InvalidInput
    Examples:
      | motive           | user                  | password         | warning                                                                                                                          |
      | Invalid password | sgroangie13@gmail.com | asdasds          | Error: The password you entered for the username sgroangie13@gmail.com is incorrect. Lost your password?                         |
      | Invalid user     | ajshdakj              | asdasd4322321fds | Error: The username ajshdakj is not registered on this site. If you are unsure of your username, try your email address instead. |

    @MissingInput
    Examples:
      | motive                    | user                  | password         | warning                      |
      | Missing user              |                       | asdasd4322321fds | Error: Username is required. |
      | Missing password          | sgroangie13@gmail.com |                  | Error: Password is required. |
      | Missing user and password |                       |                  | Error: Username is required. |