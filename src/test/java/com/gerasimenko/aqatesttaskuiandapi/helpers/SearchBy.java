package com.gerasimenko.aqatesttaskuiandapi.helpers;

import com.gerasimenko.aqatesttaskuiandapi.api.ApiUrlEndpoints;
import com.gerasimenko.aqatesttaskuiandapi.api.Specification;
import com.gerasimenko.aqatesttaskuiandapi.model.FilmResponse;
import com.gerasimenko.aqatesttaskuiandapi.model.PeopleResponse;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ValidatableResponse;

import java.util.ArrayList;
import java.util.List;

public class SearchBy {
    public static ResponseBodyExtractionOptions responseBodyExtractionOptions(String url) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get(url)
                .then().extract().body();
    }

    public static List<FilmResponse> searchByFilmName(String filmName) {
        initializeSpecification("", 200);

        List<FilmResponse> results = validatableResponse(ApiUrlEndpoints.FILMS.getUrl())
                .extract().body().jsonPath().getList("results", FilmResponse.class);

        List<FilmResponse> filmResponses = new ArrayList<>();
        results.forEach(filmResponse -> {
            if (filmResponse.getTitle().equals(filmName))
                filmResponses.add(filmResponse);
        });

        return filmResponses;
    }

    public static List<PeopleResponse> searchByPeopleName(String peopleName) {
        initializeSpecification("", 200);
        List<PeopleResponse> results = validatableResponse(ApiUrlEndpoints.STARSHIPS.getUrl())
                .extract().body().jsonPath().getList("results", PeopleResponse.class);

        List<PeopleResponse> peopleResponses = new ArrayList<>();
        results.forEach(peopleResponse -> {
            if (peopleResponse.getName().equals(peopleName))
                peopleResponses.add(peopleResponse);
        });

        return peopleResponses;
    }

    private static ValidatableResponse validatableResponse(String url) {
        return RestAssured.given().when().get(url).then();
    }

    private static void initializeSpecification(String url, Integer status) {
        Specification.initializeSpecification(
                Specification.requestSpecification(url),
                Specification.responseSpecification(status)
        );
    }
}
