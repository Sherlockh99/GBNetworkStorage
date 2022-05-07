package client.dto;

public class AuthRequest implements BasicRequest {

    private String login;
    private String password;

    private final String TYPE = "AUTH";

    @Override
    public String getType() {
        return TYPE;
    }

    public String getLogin() {
        return login;
    }
}
