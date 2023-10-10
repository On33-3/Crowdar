Feature: Registration

  @SuccessfulRegistration  @TestCase1
  Scenario: Successful registration
    Given the client enters the MyAccount page
    When  the client enters email and password
    And   the client click on register button
    Then  the client sees a welcome message

  @Smoke
    @FailedRegistration  @TestCase2-5
  Scenario Outline: Failed registration by <motive>
    Given the client enters the MyAccount page
    When  the client enters <email> and <password> on the Register section
    And   the client click on register button
    Then a <warnings> is shown on registration section

    @InvalidInput
    Examples:
      | motive        | email             | password | warnings                                                                       |
      | Invalid email | pepe123@gmail.com |          | Error: An account is already registered with your email address. Please login. |

    @MissingInput
    Examples:
      | motive                     | email                   | password | warnings                              |
      | Missing password           | josesisto3000@gmail.com |          |Error: Please enter an account password.     |
      | Missing email and password |                         |          |Error: Please provide a valid email address. |

