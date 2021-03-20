package com.desafio_api.tests.auth.requests;


import io.qameta.allure.Step;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

public class PostAuthRequest {

    @Step("Buscar o token")
    public Response token(){

        JSONObject payload = new JSONObject();
        
        payload.put("username", "user-public-notificacoes");
        payload.put("password", "Za4qNXdyQNSa9YaA");

        System.out.println(payload.toJSONString());

        return given()
                 .header("Content-Type", "application/json")
                 .when()
                 .body(payload.toString())
                 .post("auth");
                 
    }
    @Step("Retornar o token")
    public String getToken(){
        this.token().then().log().all();
        return "token=" +  this.token().then().statusCode(201).extract().path("token");
    }
    
}
