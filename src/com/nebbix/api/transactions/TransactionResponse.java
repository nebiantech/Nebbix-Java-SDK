package com.nebbix.api.transactions;

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
/**
 *
 * @author Jevison7x
 * @since May 1, 2021 12:56:00 PM
 */
public class TransactionResponse
{
    private boolean success;
    private ResponseData responseData;
    private String message;
    private String ref;

    public TransactionResponse()
    {
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public ResponseData getResponseData()
    {
        return responseData;
    }

    public void setResponseData(ResponseData responseData)
    {
        this.responseData = responseData;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getRef()
    {
        return ref;
    }

    public void setRef(String ref)
    {
        this.ref = ref;
    }
}
