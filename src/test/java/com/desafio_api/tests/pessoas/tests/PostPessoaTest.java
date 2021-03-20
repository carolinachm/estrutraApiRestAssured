package com.desafio_api.tests.pessoas.tests;

import com.desafio_api.tests.base.tests.BaseTest;
import com.desafio_api.tests.pessoas.requests.PostPessoaRequest;
import com.desafio_api.utils.Utils;

import org.junit.Test;

import io.qameta.allure.junit4.DisplayName;


public class PostPessoaTest extends BaseTest{

    PostPessoaRequest postPessoaRequest = new PostPessoaRequest();

    @Test
    @DisplayName("Criar cadastro de pessoa")
    public void deveCadastrarUmaPessoa() throws Exception{
            postPessoaRequest.criarCadastro(Utils.createdPayLoadBooking())
            .then()
            .assertThat()
            .statusCode(201);   
    }
    
}
