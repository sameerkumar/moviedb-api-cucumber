$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TVDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Get TV program details",
  "description": "In order to know about a TV program\nAn end user should be able to\nFetch all available program details",
  "id": "get-tv-program-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Program seasons can be fetched",
  "description": "",
  "id": "get-tv-program-details;program-seasons-can-be-fetched",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@program-details"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "existing tv program \u003cname\u003e and season number \u003cseason_number\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "request to fetch program season is made",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "all \u003cepisodes\u003e episodes in the season are fetched",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "get-tv-program-details;program-seasons-can-be-fetched;",
  "rows": [
    {
      "cells": [
        "name",
        "season_number",
        "episodes"
      ],
      "line": 12,
      "id": "get-tv-program-details;program-seasons-can-be-fetched;;1"
    },
    {
      "cells": [
        "Breaking Bad",
        "5",
        "16"
      ],
      "line": 13,
      "id": "get-tv-program-details;program-seasons-can-be-fetched;;2"
    },
    {
      "cells": [
        "Breaking Bad",
        "4",
        "13"
      ],
      "line": 14,
      "id": "get-tv-program-details;program-seasons-can-be-fetched;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Program seasons can be fetched",
  "description": "",
  "id": "get-tv-program-details;program-seasons-can-be-fetched;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@program-details"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "existing tv program Breaking Bad and season number 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "request to fetch program season is made",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "all 16 episodes in the season are fetched",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Breaking Bad",
      "offset": 20
    },
    {
      "val": "5",
      "offset": 51
    }
  ],
  "location": "TvDetailsSteps.getProgramSeasons(String,int)"
});
formatter.result({
  "duration": 106406311,
  "status": "passed"
});
formatter.match({
  "location": "TvDetailsSteps.fetchProgramSeasons()"
});
formatter.result({
  "duration": 1771068150,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 4
    }
  ],
  "location": "TvDetailsSteps.checkSeasonEpisodesCount(int)"
});
formatter.result({
  "duration": 142850,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Program seasons can be fetched",
  "description": "",
  "id": "get-tv-program-details;program-seasons-can-be-fetched;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@program-details"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "existing tv program Breaking Bad and season number 4",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "request to fetch program season is made",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "all 13 episodes in the season are fetched",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Breaking Bad",
      "offset": 20
    },
    {
      "val": "4",
      "offset": 51
    }
  ],
  "location": "TvDetailsSteps.getProgramSeasons(String,int)"
});
formatter.result({
  "duration": 477635,
  "status": "passed"
});
formatter.match({
  "location": "TvDetailsSteps.fetchProgramSeasons()"
});
formatter.result({
  "duration": 560679802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "13",
      "offset": 4
    }
  ],
  "location": "TvDetailsSteps.checkSeasonEpisodesCount(int)"
});
formatter.result({
  "duration": 122245,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Cast of an episode can be fetched",
  "description": "",
  "id": "get-tv-program-details;cast-of-an-episode-can-be-fetched",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@program-details"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "existing tv program \u003cname\u003e and season number \u003cseason_number\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "request to fetch credits for episode \u003cepisode_num\u003e is made",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "\u003cactor\u003e is present in the cast list",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "get-tv-program-details;cast-of-an-episode-can-be-fetched;",
  "rows": [
    {
      "cells": [
        "name",
        "season_number",
        "episode_num",
        "actor"
      ],
      "line": 22,
      "id": "get-tv-program-details;cast-of-an-episode-can-be-fetched;;1"
    },
    {
      "cells": [
        "Game of Thrones",
        "5",
        "2",
        "Myrcella Baratheon"
      ],
      "line": 23,
      "id": "get-tv-program-details;cast-of-an-episode-can-be-fetched;;2"
    },
    {
      "cells": [
        "Breaking Bad",
        "1",
        "1",
        "Walter White"
      ],
      "line": 24,
      "id": "get-tv-program-details;cast-of-an-episode-can-be-fetched;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Cast of an episode can be fetched",
  "description": "",
  "id": "get-tv-program-details;cast-of-an-episode-can-be-fetched;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@program-details"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "existing tv program Game of Thrones and season number 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "request to fetch credits for episode 2 is made",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Myrcella Baratheon is present in the cast list",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Game of Thrones",
      "offset": 20
    },
    {
      "val": "5",
      "offset": 54
    }
  ],
  "location": "TvDetailsSteps.getProgramSeasons(String,int)"
});
formatter.result({
  "duration": 629801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 37
    }
  ],
  "location": "TvDetailsSteps.fetchProgramCredits(int)"
});
formatter.result({
  "duration": 545728484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Myrcella Baratheon",
      "offset": 0
    }
  ],
  "location": "TvDetailsSteps.checkActorInCast(String)"
});
formatter.result({
  "duration": 1088836,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Cast of an episode can be fetched",
  "description": "",
  "id": "get-tv-program-details;cast-of-an-episode-can-be-fetched;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@program-details"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "existing tv program Breaking Bad and season number 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "request to fetch credits for episode 1 is made",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Walter White is present in the cast list",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Breaking Bad",
      "offset": 20
    },
    {
      "val": "1",
      "offset": 51
    }
  ],
  "location": "TvDetailsSteps.getProgramSeasons(String,int)"
});
formatter.result({
  "duration": 433476,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 37
    }
  ],
  "location": "TvDetailsSteps.fetchProgramCredits(int)"
});
formatter.result({
  "duration": 586471910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Walter White",
      "offset": 0
    }
  ],
  "location": "TvDetailsSteps.checkActorInCast(String)"
});
formatter.result({
  "duration": 119555,
  "status": "passed"
});
});