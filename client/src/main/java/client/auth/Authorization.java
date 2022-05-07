package client.auth;

import client.EnumRequests;

public class Authorization implements Request{
    @Override
    public EnumRequests getType() {
        return EnumRequests.AUTH_REQUEST;
    }
}
