Feature: Access https://www.exercise1.com/values website

  Scenario: Need to verify the right number of values appear on the screen
    When I open exercisesel website
    Then I Should see Value "$122,365.24" in Value1 Field
    Then I Should see Value "$599.00" in Value2 Field
    Then I Should see Value "$850,139.99" in Value3 Field
    Then I Should see Value "$23,329.50" in Value4 Field
    Then I Should see Value "$566.27" in Value5 Field

 Scenario: Need to verify the values on the screen are greater than 0
    When I open exercisesel website
    Then I Should see Value in Value1 Field is Greater than 0
    Then I Should see Value in Value2 Field is Greater than 0
    Then I Should see Value in Value3 Field is Greater than 0
    Then I Should see Value in Value4 Field is Greater than 0
    Then I Should see Value in Value5 Field is Greater than 0
    
Scenario: Need to verify the total balance is correct based on the values listed on the screen
    When I open exercisesel website
    Then I Should see Value "$1,000,000.00" in Balance Field
    
Scenario: Need to verify the values are formatted as currencies
    When I open exercisesel website
    Then I Should see Value in Value1 Field is currency value
    Then I Should see Value in Value2 Field is currency value
    Then I Should see Value in Value3 Field is currency value
    Then I Should see Value in Value4 Field is currency value
    Then I Should see Value in Value5 Field is currency value  
    
Scenario: Need to verify the total balance matches the sum of the values
    When I open exercisesel website
    Then Sum of All Values should match with Total Balance     
  