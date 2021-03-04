package Task5;

public interface IUser {

    String getLogin();
    String getPass();

    void setLogin(String login);
    void setPass(String pass);
    boolean autentificate(String login,String pass);




}
