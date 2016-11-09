Feature: Get TV program details
  In order to know about a TV program
  An end user should be able to
  Fetch all available program details

  @program-details
  Scenario Outline: Program seasons can be fetched
    Given existing tv program <name> and season number <season_number>
    When request to fetch program season is made
    Then all <episodes> episodes in the season are fetched
    Examples:
    |     name      | season_number | episodes |
    | Breaking Bad  |       5       |   16     |
    | Breaking Bad  |       4       |   13     |

  @program-details
  Scenario Outline: Cast of an episode can be fetched
    Given existing tv program <name> and season number <season_number>
    When request to fetch credits for episode <episode_num> is made
    Then <actor> is present in the cast list
    Examples:
      |       name       | season_number | episode_num |        actor          |
      | Game of Thrones  |       5       |   2         |  Myrcella Baratheon   |
      |   Breaking Bad   |       1       |   1         |   Walter White        |



