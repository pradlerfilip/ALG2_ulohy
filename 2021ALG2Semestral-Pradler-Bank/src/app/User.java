package app;

public class User
{
    protected String username;
    protected String password;
    protected char symbol;

    public User(String username, String password, char symbol)
    {
        this.username = username;
        this.password = password;
        this.symbol = symbol;
    }

    public String getUsername() {
        return username;
    }

}
