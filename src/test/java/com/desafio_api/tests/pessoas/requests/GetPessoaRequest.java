package com.desafio_api.tests.pessoas.requests;


import io.qameta.allure.Step;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetPessoaRequest {


    @Step("Buscar todas as pessoas")
    public Response buscarTodasAsPessoas(){
        return given()
            .header("Content-Type", "applicataion/json")
            .when()
            .get("pessoa");
    }
    @Step("Buscar uma pessoa pelo codigo")
    public Response buscarPessoaPeloCodigo(){
        return given()
            .header("Content-Type", "applicataion/json")
            .param("codigo", 376)
            .when().get("pessoa/" + 376);
    }
    
}
