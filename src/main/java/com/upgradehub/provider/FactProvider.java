package com.upgradehub.provider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FactProvider {

    private final HttpClientConfig httpClientConfig;

    public String getFact() {
        //getForEntity() turn the result from the url to be parsed to ProviderFactResponse
        final var response = httpClientConfig.restTemplate().getForEntity("https://catfact.ninja/fact", FactResponse.class);
        return response.getBody().getFact();
    }
}
