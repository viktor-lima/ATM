package atm;

import entities.User;

import static atm.EnforceOrderRules.isValidUser;

public class CaixaEletronico {

    public static String login(User user){
        if(isValidUser(user))
            return "Usuário autenticado";
        return "Não foi possivel autenticar o Usuário";

    }
}
