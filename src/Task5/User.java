package Task5;

import java.util.Locale;

public class User implements IUser, IPerson {

    private String name;
    private String phone;

    private String login="user";
    private String pass="user";


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean autentificate(String login, String pass) {
       if (login.toLowerCase().equals(this.login)&&pass.toLowerCase().equals(this.pass)){
           return true;
       }
       return false;
    }



}
