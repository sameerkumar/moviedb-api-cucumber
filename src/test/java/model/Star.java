package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Star {

	String character;
	String credit_id;
	String name;
	String profile_path;
	String id;
	String order;

	public void setName(String name) {
		this.name = name;
	}

	public void setProfile_path(String profile_path) {
		this.profile_path = profile_path;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCredit_id(String credit_id) {
		this.credit_id = credit_id;
	}

	public String getCharacter() {
		return character;
	}

	public String getCredit_id() {
		return credit_id;
	}

	public String getId() {
		return id;
	}

	public String getOrder() {
		return order;
	}

	public String getProfile_path() {
		return profile_path;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
