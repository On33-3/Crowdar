@HomePage
Feature: As a potential customer, I need to see the elements on the home page and interact with them.

#
#  @HomePage  @TestCase1
#  Scenario: Verify that HomePage contains 3 slider only
#    Given the client enters the home page
#    When  the client clicks on "Shop Menu" button
#    And   the client clicks on Home button
#    Then  the client should see 3 sliders only on the HomePage
#
#  @HomePage  @TestCase2
#  Scenario: Verify that HomePage contains 3 arrivals only
#    Given the client enters the home page
#    When  the client clicks on "Shop Menu" button
#    And   the client clicks on Home button
#    Then  the client should see 3 arrivals only on the HomePage

  Scenario: Verify adding a book to the Basket
    Given the client enters the home page
    When  the client clicks on Shop Menu button
    And   the client clicks on Home button
    And   the client clicks on one of the 3 arrivals picture
    Then  the client is taken to a screen where they can add the book to their basket


  Scenario: Verify description of a selected book
    Given the client enters the home page
    When  the client clicks on Shop Menu button
    And   the client clicks on Home button
    And   the client clicks on one of the 3 arrivals picture
    And   the client clicks on Description tab
    Then  the client should see the description of the selected book


  Scenario: Verify reviews of a selected book
    Given the client enters the home page
    When  the client clicks on Shop Menu button
    And   the client clicks on Home button
    And   the client clicks on one of the 3 arrivals picture
    And   the client clicks on reviews tab
    Then  the client should see the reviews of the selected book
