Feature: Retail Account Page

  Background: 
    Given User is on retail website

  @updatePI
  Scenario: Verify User can update Profile information
    When User click on Account option
    And User update Name 'Ehsan jan' and Phone '778-888-8888'
    And User click on update button
    Then User profile information should be updated

  @addPaymentMethod
  Scenario: Verify user can add a payment method
    And User click on add a payment method link
    And User fill debit or credit card information
      | cardNumber   | NameOnCard | ExpirationMonth | ExpirationYear | CVV |
      | 777788889999 | Ehsan jan  |              07 |           2027 | 777 |
    And User click on add your card button
    Then a message should be dosplayed 'Payment Method added successfully'

  @editDibitOrCredit
  Scenario: Verify user can edit debit or credit card
    And User click on edit option of card section
    And User edit information with below data
      | CardNumebr   | NameOnCard  | ExpirationMonth | Expirationyear | CVV |
      | 111122223333 | Rashid Khan |              08 |           2025 | 789 |
    And User click on update your card button
    Then a message should be displayed 'Payment Method updated Successfuly'

  @removeDebitOrCredit
  Scenario: Verify user can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be remove

  @addAddress
  Scenario: Verify user can add an Address
    And User click on add address option
    And User fill new address form woth below information
      | Country | FullName   | PhoneNumber  | StreetAddress | apt | City      | State | PC     |
      | Canada  | Ehsaan Jan | 778-888-9999 | 777 park Rd   |  07 | Vancouver | BC    | V5J1A8 |
    And User click update your address button
    Then a message should be displayed 'Address Updated Successfuly'

  @removeAddress
  Scenario: Verify user can remove address from account
    And User click on remove option of address section
    Then Address details should removed
