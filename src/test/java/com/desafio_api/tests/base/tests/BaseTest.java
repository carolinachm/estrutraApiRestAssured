package com.desafio_api.tests.base.tests;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class BaseTest {

    
    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://gitmaratonadev.stefanini.com.br/maratonaqa/api/service";
    }
    
}
