package fixturies;

import entities.User;

public class UserFixturies {

    public static User getUser(){
        User user  = new User();
        user.setUser("João Viktor");
        user.setSenha("123");
        return user;
    }
}
