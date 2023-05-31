package atm;

import entities.User;
import fixturies.UserFixturies;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CaixaEletronicoTest {
    private CaixaEletronico caixaEletronico;
    private User user;
    @BeforeEach
    void inicializeStack(){
        caixaEletronico = new CaixaEletronico();
        user  = UserFixturies.getUser();
    }

    @Test
    public void success_login(){
        String response = CaixaEletronico.login(user);
        Assertions.assertEquals("Usuário autenticado", response);
    }

    @Test
    public void success_loginUserNull(){
        user.setUser(null);
        user.setSenha(null);
        String response = CaixaEletronico.login(user);
        Assertions.assertEquals("Não foi possivel autenticar o Usuário", response);
    }

    @Test
    public void success_loginUserIsEmpty(){
        user.setUser("");
        user.setSenha("");
        String response = CaixaEletronico.login(user);
        Assertions.assertEquals("Não foi possivel autenticar o Usuário", response);
    }

    @Test
    public void success_balance(){
        String response = CaixaEletronico.balance(user.getAmount());
        Assertions.assertEquals("O saldo é R$50.0", response);
    }


}