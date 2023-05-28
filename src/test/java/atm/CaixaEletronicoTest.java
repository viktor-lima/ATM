package atm;

import entities.User;
import fixturies.UserFixturies;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CaixaEletronicoTest {
    private CaixaEletronico caixaEletronico;
    @BeforeEach
    void inicializeStack(){
        caixaEletronico = new CaixaEletronico();
    }

    @Test
    public void success_login(){
        User user  = UserFixturies.getUser();
        boolean flag = CaixaEletronico.login(user);
        Assertions.assertTrue(flag);
    }
}