package com.desafio_api.tests.base.tests;

public class BaseTest {

    
    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://gitmaratonadev.stefanini.com.br/swagger-ui.html#/";
    }
    
}
