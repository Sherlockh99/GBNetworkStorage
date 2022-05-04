package com.sherlock.gb.networkstorage.client.auth;

import com.sherlock.gb.networkstorage.client.EnumRequests;

public class Authorization implements Request{
    @Override
    public EnumRequests getType() {
        return EnumRequests.AUTH_REQUEST;
    }
}
