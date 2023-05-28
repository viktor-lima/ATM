package atm;

import entities.User;
import fixturies.UserFixturies;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static atm.EnforceOrderRules.isValidUser;

public class EnforceOrderRulesTest {

    private User user;
    @BeforeEach
    void inicializeStack(){
        user  = UserFixturies.getUser();
    }

    @Test
    public void success_isValidUser(){
        boolean flag = isValidUser(user);
        Assertions.assertTrue(flag);
    }
    @Test
    public void success_isValidUserNull(){
        user.setUser(null);
        user.setSenha(null);
        boolean flag = isValidUser(user);
        Assertions.assertFalse(flag);
    }
    @Test
    public void success_isValidUserIsEmpty(){
        user.setUser("");
        user.setSenha("");
        boolean flag = isValidUser(user);
        Assertions.assertFalse(flag);
    }
}
