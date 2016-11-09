package utils;

import model.Credits;
import model.Episode;
import model.Season;
import model.Star;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@Component
public class Helper {

	@Autowired
	GenerateRequest generateRequest;

	public boolean search(List<Episode> episodeList, String episodeName, String actor) {
		for(Episode episode: episodeList) {
			for(Star guestStar: episode.getGuest_stars()){
				if(guestStar.getCharacter().equals(actor)){
					return true;
				}
			}
		}
		return false;
	}

	public Credits getTvCredits(int tvId, int seasonNumber, int episodeNumber) throws IOException {
		HttpUriRequest request = new HttpGet(generateRequest.tvCreditsRequest(tvId, seasonNumber, episodeNumber));

		HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );

		assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(HttpStatus.SC_OK);

		String json = EntityUtils.toString(httpResponse.getEntity());

		JSONObject responseJson = new JSONObject(json);

		ObjectMapper objectMapper = new ObjectMapper();

		byte[] jsonData = responseJson.toString().getBytes();

		return objectMapper.readValue(jsonData, Credits.class);
	}

	public boolean isStarInCast(List<Star> stars, String starName) {
		for (Star star: stars) {
			System.out.println(star.getCharacter());
			if(star.getCharacter().equals(starName)){
				return true;
			}
		}
		return false;
	}

	public Season getTvDetails(int tvId, int seasonNumber) throws IOException {
		HttpUriRequest request = new HttpGet(generateRequest.tvDetailRequest(tvId, seasonNumber));

		HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );

		assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(HttpStatus.SC_OK);

		String json = EntityUtils.toString(httpResponse.getEntity());

		JSONObject responseJson = new JSONObject(json);

		ObjectMapper objectMapper = new ObjectMapper();

		byte[] jsonData = responseJson.toString().getBytes();

		return objectMapper.readValue(jsonData, Season.class);
	}

	public int getTvId(String programName) {
		int tvId = 0;
		switch(programName) {
			case "Game of Thrones" :
				tvId = 1399;
				break;
			case "Breaking Bad"	  :
				tvId = 1396;
				break;
		}
		return tvId;
	}
}
