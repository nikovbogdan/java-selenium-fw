Feature:
  Write some TC in Gherkin format

  Scenario: Test Dropdowns
    Given User navigates to homepage and clicks "dropdown" link
    When user select "option 1"
    Then user will verify "option 1" is selected
    When user select "option 2"
    Then user will verify "option 2" is selected



  Scenario: Test Checkboxes - first checkbox
    Given User navigates to homepage and clicks "checkboxes" link
    When user marks "first" checkbox
    Then user will verify "first" is selected
    When user UNMARK "first" checkbox
    Then user will verify "first" is NOT selected
    When user marks "second" checkbox
    Then user will verify "second" is selected
    When user UNMARK "second" checkbox
    Then user will verify "second" is NOT selected

