package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Credits {

	private int id;

	private List<Star> cast;

	private List<Star> guest_stars;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public List<Star> getCast() {
		return cast;
	}

	public List<Star> getGuest_stars() {
		return guest_stars;
	}

	public void setCast(List<Star> cast) {
		this.cast = cast;
	}

	public void setGuest_stars(List<Star> guest_stars) {
		this.guest_stars = guest_stars;
	}
}
