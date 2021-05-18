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


import java.sql.Timestamp;

/**
 *
 * @author Jevison7x
 * @since May 1, 2021 12:54:21 PM
 */
public class Transaction
{
    private int id;
    private String title;
    private String memo;
    private double amount;
    private String status;
    private String phone;
    private String address;
    private String ref;
    private String customData;
    private String createdByType;
    private String type;
    private String subType;
    private Timestamp updatedAt;
    private Timestamp createdAt;
    private double dollarValue;

    public Transaction()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getMemo()
    {
        return memo;
    }

    public void setMemo(String memo)
    {
        this.memo = memo;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getRef()
    {
        return ref;
    }

    public void setRef(String ref)
    {
        this.ref = ref;
    }

    public String getCustomData()
    {
        return customData;
    }

    public void setCustomData(String customData)
    {
        this.customData = customData;
    }

    public String getCreatedByType()
    {
        return createdByType;
    }

    public void setCreatedByType(String createdByType)
    {
        this.createdByType = createdByType;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getSubType()
    {
        return subType;
    }

    public void setSubType(String subType)
    {
        this.subType = subType;
    }

    public Timestamp getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public Timestamp getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt)
    {
        this.createdAt = createdAt;
    }

    public double getDollarValue()
    {
        return dollarValue;
    }

    public void setDollarValue(double dollarValue)
    {
        this.dollarValue = dollarValue;
    }
}
