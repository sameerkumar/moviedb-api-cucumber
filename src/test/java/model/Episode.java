package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Episode {

	String production_code;
	String air_date;
	String overview;
	String episode_number;
	String vote_count;
	String vote_average;
	String name;
	String season_number;
	String id;
	String still_path;
	String count;

	public String getVote_average() {
		return vote_average;
	}

	public void setVote_average(String vote_average) {
		this.vote_average = vote_average;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getAir_date() {
		return air_date;
	}

	public String getCount() {
		return count;
	}

	public String getEpisode_number() {
		return episode_number;
	}

	public String getOverview() {
		return overview;
	}

	public String getProduction_code() {
		return production_code;
	}

	public String getSeason_number() {
		return season_number;
	}

	public String getStill_path() {
		return still_path;
	}

	public String getVote_count() {
		return vote_count;
	}

	public void setAir_date(String air_date) {
		this.air_date = air_date;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public void setEpisode_number(String episode_number) {
		this.episode_number = episode_number;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public void setProduction_code(String production_code) {
		this.production_code = production_code;
	}

	public void setSeason_number(String season_number) {
		this.season_number = season_number;
	}

	public void setStill_path(String still_path) {
		this.still_path = still_path;
	}

	public void setVote_count(String vote_count) {
		this.vote_count = vote_count;
	}

	private List<Crew> crew;

	private List<Star> guest_stars;

	public List<Crew> getCrew() {
		return crew;
	}

	public List<Star> getGuest_stars() {
		return guest_stars;
	}

	public void setCrew(List<Crew> crew) {
		this.crew = crew;
	}

	public void setGuest_stars(List<Star> guest_stars) {
		this.guest_stars = guest_stars;
	}
}

