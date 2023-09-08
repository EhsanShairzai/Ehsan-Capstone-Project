Feature: Retail Order Page

Background: 
Given User is on retail website homepage
When User click on the login link
And User enter email 'GuradiansCaps$123@gmail.com' and password 'GuardainsCap123$'
And User click on login button
Then Verify user is logged in

@addItemToCart
Scenario: Verify user can add an item to cart
And User change the category to 'Smart Home'
And User search for an item 'kasa outdoor smart plug'
And User click on search icon
And User click on item
And User select quantity '2'
And User click add to cart button
Then the cart icon quantity should be changed to '2'

@addItemCartAndCheckout
Scenario: Verify user can place an order woth shipping address and payment method on file
And User changes the category to 'Electronics' Apex Legends 
And User searches for an item 'Apex Legends' Apex Legends
And User click on item apex legends
And User select quantity '5' for Apex Legends
And user click add to cart button
Then the cart icon quantity should be changed to '5'
And User click on cart option
And User click on proceed to checkout button
And User click on place your order
Then a message should be displayed  'Order wrong item'

@cancelOrder
Scenario: Verify user can cancel the order
And User click on orders section
And User click on first order in list
And User click on cencel the order button
And User select the cancelation reason 'Bought wrong item'
And User click on cancel order button
Then a cancelation message should be displayed 'Your Order has Been Cancelled'

@returnOrder
Scenario: Verify user can write a review on order placed
And User click on orders sections
And User click on the first order in list
And User click on review button
And User click review headline 'headline value' and 'review text'
And User click add your review button
Then a review message should be displayed 'your review was added successfully'