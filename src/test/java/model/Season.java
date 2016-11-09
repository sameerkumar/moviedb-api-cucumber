package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Season {

	Date air_date;
	String overview;
	String name;
	int season_number;
	String _id;
	Long id;

	public int getSeason_number() {
		return season_number;
	}

	public String getName() {
		return name;
	}

	public void setSeason_number(int season_number) {
		this.season_number = season_number;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Date getAir_date() {
		return air_date;
	}

	public String get_id() {
		return _id;
	}

	public String getOverview() {
		return overview;
	}

	public void setAir_date(Date air_date) {
		this.air_date = air_date;
	}

	public void set_id(String id) {
		_id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Episode> episodes;

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
}
