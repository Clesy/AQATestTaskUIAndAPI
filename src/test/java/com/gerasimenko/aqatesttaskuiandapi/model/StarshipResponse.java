package com.gerasimenko.aqatesttaskuiandapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class StarshipResponse {
    @JsonProperty("name")
    private String name;
    @JsonProperty("model")
    private String model;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("cost_in_credits")
    private String costInCredits;
    @JsonProperty("length")
    private String length;
    @JsonProperty("max_atmosphering_speed")
    private String maxAtmosphericSpeed;
    @JsonProperty("crew")
    private String crew;
    @JsonProperty("passengers")
    private String passengers;
    @JsonProperty("cargo_capacity")
    private String cargoCapacity;
    @JsonProperty("consumables")
    private String consumables;
    @JsonProperty("hyperdrive_rating")
    private String hyperactiveRating;
    @JsonProperty("MGLT")
    private String mGLT;
    @JsonProperty("starship_class")
    private String starshipClass;
    @JsonProperty("pilots")
    private List<String> pilots;
    @JsonProperty("films")
    private List<String> films;
    @JsonIgnore
    @JsonProperty("created")
    private Date created;
    @JsonIgnore
    @JsonProperty("edited")
    private Date edited;
    @JsonProperty("url")
    private String url;
}
