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
package com.nebbix.litecoin;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

/**
 *
 * @author Jevison7x
 * @since May 18, 2021 2:56:59 PM
 */
public class LiteCoinAPI
{
    public static JSONObject sendLtc(JSONObject header, JSONObject data) throws UnirestException
    {
        HttpResponse<JsonNode> response = Unirest.post("https://api.nebbix.com/userApi/wallet/send")
                .header("user-access-token", header.getString("user-access-token"))
                .header("client-id", header.getString("client-id"))
                .body(data)
                .asJson();
        return response.getBody().getObject();
    }

    public static JSONObject createLtcWallet(JSONObject header, JSONObject data) throws UnirestException
    {
        HttpResponse<JsonNode> response = Unirest.post("https://api.nebbix.com/userApi/wallet/create")
                .header("user-access-token", header.getString("user-access-token"))
                .header("client-id", header.getString("client-id"))
                .body(data)
                .asJson();
        return response.getBody().getObject();
    }

    public static JSONObject createLtcWalletAddress(JSONObject header, JSONObject data) throws UnirestException
    {
        HttpResponse<JsonNode> response = Unirest.post("https://api.nebbix.com/userApi/wallet/create_address")
                .header("user-access-token", header.getString("user-access-token"))
                .header("client-id", header.getString("client-id"))
                .body(data)
                .asJson();
        return response.getBody().getObject();
    }

    public static JSONObject getLtcWallets(JSONObject header) throws UnirestException
    {
        HttpResponse<JsonNode> response = Unirest.get("https://api.nebbix.com/userApi/wallet")
                .header("user-access-token", header.getString("user-access-token"))
                .header("client-id", header.getString("client-id"))
                .queryString("currency", "LTC")
                .asJson();
        return response.getBody().getObject();
    }
}
