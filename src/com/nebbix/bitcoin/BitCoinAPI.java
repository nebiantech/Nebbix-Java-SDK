/*
 * Copyright (c) 2018, Xyneex Technologies. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * You are not meant to edit or modify this source code unless you are
 * authorized to do so.
 *
 * Please contact Xyneex Technologies, #1 Orok Orok Street, Calabar, Nigeria.
 * or visit www.xyneex.com if you need additional information or have any
 * questions.
 */
package com.nebbix.bitcoin;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

/**
 *
 * @author Jevison7x
 * @since May 18, 2021 1:56:28 PM
 */
public class BitCoinAPI
{
    public static JSONObject sendBtc(JSONObject header, JSONObject data) throws UnirestException
    {
        HttpResponse<JsonNode> response = Unirest.post("http://httpbin.org/post")
                .header("user-access-token", header.getString("user-access-token"))
                .header("client-id", header.getString("client-id"))
                .body(data)
                .asJson();
        return response.getBody().getObject();
    }
}
