package org.example.api;

import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class UnicornsRequests {
    public static String createUnicorn(String body) {
        return
                given().body(body).contentType("application/json")
                        .when().post("/unicorns")
                        .then().assertThat().statusCode(HttpStatus.SC_CREATED).body("$", hasKey("_id")).extract().path("_id");
    }

    public static void deleteUnicorn(String getId) {
        given().delete("/unicorns/" + getId)
                .then().assertThat().statusCode(200);
    }

    public static void updateUnicorn(String getId,String boby) {
        given().body(boby).contentType("application/json")
         .when().put("/unicorns/" + getId)
           .then().assertThat().statusCode(HttpStatus.SC_OK);
    }
}
