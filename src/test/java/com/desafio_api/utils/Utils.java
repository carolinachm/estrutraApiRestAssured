package com.desafio_api.utils;

import org.json.simple.JSONObject;

public class Utils {

    public static JSONObject createdPayLoadBooking(){
        JSONObject payload = new JSONObject();

            payload.put("auacao", "teste");
            payload.put("codigo", 1);
            payload.put("dtFim", "17/02/2021");
            payload.put("dtInicio", "17/02/2021");
            payload.put("email", "teste@teste");
            payload.put("idade", "12");
            payload.put("nome", "teste");
            payload.put("senha", "12345");
            payload.put("sexo", "dsa");
            payload.put("telefone", "123456789");

        return payload;
    }
    
}
