package com.gerasimenko.aqatesttaskuiandapi.api;

public enum ApiUrlEndpoints {
    FILMS("api/films"),
    STARSHIPS("api/starships"),
    ;

    private final String url;

    ApiUrlEndpoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
