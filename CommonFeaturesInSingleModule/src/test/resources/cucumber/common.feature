# language: en

@primaryDefault
Feature: Common feature

  @secondaryDefault
  Scenario: Common scenario 1
    When step 1
    Then step 2

  @primaryOther
  Scenario: Common scenario 2
    When step 1
    Then step 3
