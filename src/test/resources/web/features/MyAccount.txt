Feature: MyAccount

  @Dashboard @TestCase1
  Scenario: View MyAccountPage-Dashboard
    Given the client logs in succesfully
#  When the client clicks the button: 'REGISTER' !!!!!!!!!!!!!!!!!!!!!!!!!!
    Then the client should see the MyAccountPage-Dashboard

  @Orders @TestCase2
  Scenario: View previous Orders list
    Given the client logs in succesfully
    When the client clicks button: 'Orders'
    Then the client should see their previous orders

  @Orders @TestCase3
  Scenario: View 'OrderId', 'Date' and 'Status' on Order detail
    Given the client logs in succesfully
    When the client clicks button: 'Orders'
    And the client clicks button: 'View'
    Then the client should see the order's details['OrderId', 'Date', 'Status']

  @Orders @TestCase4
  Scenario: View 'Order details', 'Customer Details' and 'Billing Address' on Order detail
    Given the client logs in succesfully
    When the client clicks button: 'Orders'
    And the client clicks button: 'View'
    Then the client should see the order's details sections['Order details', 'Customer Details', 'Billing Address']

  @AddressesScenario @TestCase5
  Scenario: View previously used addresses
    Given the client logs in succesfully
    When the client clicks button: 'Addresses'
    Then the client should see their previously used 'Billing Address' and 'Shipping Address'

  @AddressesScenario @TestCase6
  Scenario Outline: Edit previously used addresses
    Given the client logs in succesfully
    When the client clicks button: 'Addresses'
    And the client clicks button: 'Edit' on <section>
    Then the client should be able to succesfully edit <section> data
    Examples:
      | section          |  |
      | Billing address  |  |
      | Shipping address |  |

  @AccountDetails @TestCase7
  Scenario: View account details and change password
    Given the client logs in succesfully
    When the client clicks button: 'Account Details'
    Then the client can view their account's details and they can change their password

  @LogOut  @TestCase8
  Scenario: Successful LogOut
    Given the client logs in succesfully
    When the client clicks button: 'Account Details'
    Then the client should be re-directed to the LogIn/Register page
