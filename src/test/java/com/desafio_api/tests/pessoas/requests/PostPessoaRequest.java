package com.desafio_api.tests.pessoas.requests;

import org.json.simple.JSONObject;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import com.desafio_api.tests.auth.requests.PostAuthRequest;

public class PostPessoaRequest {

    PostAuthRequest postAuthRequest = new PostAuthRequest();

    @Step("Criar uma cadastro de pessoa")
    public Response criarCadastro(JSONObject payload){
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json" )
                .header("Cookie", postAuthRequest.getToken())
                .when()
                .body(payload.toString())
                .post("/pessoa/");

    }
    
}
