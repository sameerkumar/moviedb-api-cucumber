package cucumber.stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Credits;
import model.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import utils.Helper;

import java.io.IOException;

import static org.assertj.core.api.Java6Assertions.assertThat;

@ContextConfiguration("classpath:applicationContext-test.xml")
public class TvDetailsSteps {
	@Autowired
	private Helper helper;

	private Season season;

	private Credits credits;

	private int programId;

	private int seasonNumber;

	@Given("^existing tv program (.*) and season number (\\d+)$")
	public void getProgramSeasons(String name, int seasonNumber) {
		this.programId = helper.getTvId(name);
		this.seasonNumber = seasonNumber;
	}

	@When("^request to fetch program season is made$")
	public void fetchProgramSeasons() throws IOException {
		season = helper.getTvDetails(programId, seasonNumber);
	}

	@When("^request to fetch credits for episode (\\d+) is made$")
	public void fetchProgramCredits(int episodeNumber) throws IOException {
		credits = helper.getTvCredits(programId, seasonNumber, episodeNumber);
	}

	@Then("^all (\\d+) episodes in the season are fetched$")
	public void checkSeasonEpisodesCount(int episodes) {
		assertThat(season.getEpisodes().size()).isEqualTo(episodes);
	}

	@Then("^(.*) is present in the cast list$")
	public void checkActorInCast(String actor) {
		assertThat(helper.isStarInCast(credits.getCast(), actor)).isTrue();
	}
}
