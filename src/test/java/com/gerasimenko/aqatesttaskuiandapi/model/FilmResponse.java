package com.gerasimenko.aqatesttaskuiandapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FilmResponse {
    @JsonProperty("title")
    private String title;
    @JsonProperty("episode_id")
    private Integer episodeId;
    @JsonProperty("opening_crawl")
    private String openingCrawl;
    @JsonProperty("director")
    private String director;
    @JsonProperty("producer")
    private String producer;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("characters")
    private List<String> characters;
    @JsonProperty("planets")
    private List<String> planets;
    @JsonProperty("starships")
    private List<String> starships;
    @JsonProperty("vehicles")
    private List<String> vehicles;
    @JsonProperty("species")
    private List<String> species;
    @JsonProperty("created")
    private Date created;
    @JsonProperty("edited")
    private Date edited;
    @JsonProperty("url")
    private String url;
}
