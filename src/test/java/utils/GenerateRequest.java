package utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GenerateRequest {
	@Autowired
	private String baseUrl;

	@Autowired
	private String apiKey;

	@Autowired
	private String apiVersion;

	public String tvCreditsRequest(int tvId, int seasonNumber, int episodeNumber) {
		return baseUrl + "/" + apiVersion + "/tv/" + tvId + "/season/" + seasonNumber
				+ "/episode/" + episodeNumber + "/credits" +"?api_key=" + apiKey;
	}

	public String tvDetailRequest(int tvId, int seasonNumber) {
		return baseUrl + "/" + apiVersion + "/tv/" + tvId + "/season/" + seasonNumber
				+ "?api_key=" + apiKey;
	}
}
