package com.desafio_api.tests.pessoas.tests;

import com.desafio_api.tests.base.tests.BaseTest;
import com.desafio_api.tests.pessoas.requests.GetPessoaRequest;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class GetPessoaTest extends BaseTest{

    GetPessoaRequest getPessoaRequest = new GetPessoaRequest();

    @Test
    public void deveListarTodasAsPessoas() throws Exception{
        getPessoaRequest.buscarTodasAsPessoas()
            .then()
            .log().all()
            .statusCode(200);
    }
    @Test
    public void deveListaUmaPessoaPeloCodigo() throws Exception{
        getPessoaRequest.buscarPessoaPeloCodigo()
            .then()
            .log().all()
            .statusCode(200)
            .body("codigo", equalTo(376), "nome", equalTo("IRBCJ"));
    }    
    
}
