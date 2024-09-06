Feature: the user Make a hotel reservation by applying various filters and criteria.

  Scenario Outline: The user wants to test the website in the filters and search
    Given  that user access successfully to the <website>
    When the user make a hotel reservation by applying various filters and criteria.
    Then the validate <validate>
    Examples:
      | website             | validate        |
      | https://booking.com | You selected Ok |