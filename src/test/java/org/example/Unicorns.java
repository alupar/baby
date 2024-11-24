package org.example;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.apache.http.HttpStatus;
import org.example.api.UnicornsRequests;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class Unicorns {
    @BeforeAll
    public static void setUp() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://crudcrud.com/api/c9612c5eb9124d16bae6e7f6e8971f1f";
    }

    @Test
    public void userShoyldBeAbleToCreateUnicorns() {
        UnicornsRequests.createUnicorn("{ \"name\":\"Верный Базилик\", \"age\":1, \"colour\":\"yellow\" }");


    }

    @Test
    public void userShoyldBeAbleToUpdateUnicorns() {
//        Создание сущности
        String getId = UnicornsRequests.createUnicorn("{ \"name\":\"Успешный Успех\", \"age\":9, \"colour\":\"Red\" }");

//        Редактирование цвета
        UnicornsRequests.updateUnicorn(getId,"{ \"name\":\"Успешный Успех\", \"age\":9, \"colour\":\"Orange\" }");
//        Проверка, что сущность изменила цвет
        given().get("/unicorns/" + getId).then().assertThat().statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void userShoyldBeAbleToDeleteUnicorns() {
//        Создание сущности
       String getId = UnicornsRequests.createUnicorn("{ \"name\":\"Игогоша\", \"age\":10, \"colour\":\"Purple\" }");

//        Удаление сущности
        UnicornsRequests.deleteUnicorn(getId);

//        Проверка, что сущность удалена
        given().get("/unicorns/" + getId).then().assertThat().statusCode(HttpStatus.SC_NOT_FOUND);

    }
}
