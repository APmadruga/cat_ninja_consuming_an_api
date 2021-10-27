package com.upgradehub.provider;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FactProvider {

    private final HttpClientConfig httpClientConfig;
    private final String url;

    public FactProvider(HttpClientConfig httpClientConfig,
                        @Value("${shelter.cat.fact.provider.url}") //  Injection by Properties??
                        String url) {
        this.httpClientConfig = httpClientConfig;
        this.url = url;
    }

    public String getFact() {
        //getForEntity() turn the result from the url to be parsed to ProviderFactResponse
        final var response = httpClientConfig.restTemplate().getForEntity(url, FactResponse.class);
        return response.getBody().getFact();
    }
}
