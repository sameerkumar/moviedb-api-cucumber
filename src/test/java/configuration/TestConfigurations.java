package configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Test Configurations.
 */
@Configuration
public class TestConfigurations {

	@Value("${base_url}")
	private String startUrl;

	@Value("${api_key}")
	private String apiKey;

	@Value("${api_version}")
	private String apiVersion;

	@Bean
	public String baseUrl() {
		return startUrl;
	}

	@Bean
	public String apiKey() {
		return apiKey;
	}

	@Bean
	public String apiVersion() {
		return apiVersion;
	}

}

