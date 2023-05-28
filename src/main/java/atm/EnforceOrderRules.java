package atm;

import entities.User;

public class EnforceOrderRules {
    public static boolean isValidUser(User user){
        if((user.getUser() == null || user.getSenha() == null) || (user.getUser().isEmpty() || user.getSenha().isEmpty()))
            return false;
        return true;
    }
}
