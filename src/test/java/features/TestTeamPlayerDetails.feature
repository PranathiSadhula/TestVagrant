Feature: Validate the team as per IPL standards

  Scenario Outline: validate that team has only 4 foreign players
    Given <Team> player details submitted
    Then validate that team has only <playerCount> <country> players
    Examples:
      | Team | country   | playerCount |
      | RCB  | nonIndian | 4           |
   #   | RCB  | 4           | NonIndian |
   #   | RCB  | 1           | Srilanka  |


  Scenario Outline: validate that there is atleast one wicket keeper
    Given <Team> player details submitted
    Then validate that team has only <playerCount> of <role> players
    Examples:
      | Team | playerCount | role          |
      | RCB  | 4           | Wicket-keeper |