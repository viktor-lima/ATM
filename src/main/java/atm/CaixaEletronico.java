package atm;

import entities.User;

import static atm.EnforceOrderRules.isValidUser;

public class CaixaEletronico {

    public static String login(User user){
        if(isValidUser(user))
            return "Usuário autenticado";
        return "Não foi possivel autenticar o Usuário";
    }

    public static String balance(Double amount){
            return "O saldo é R$" + amount;
    }

    public static String withdraw(Double value, User user){
        if(value == 0.00 || value == null) return "Saldo insuficiente";
        return user.getAmount() < value ? "Saldo insuficiente" : "Retire seu dinheiro";
    }

    public static String deposit(Double value, User user){
        if(value <= 0 || value == null )
            return "Não tem como depositar nada ( zero )";
        user.setAmount(user.getAmount() +  value);
        System.out.println(user.getAmount());
        return "Deposito de: " + value + " efetuado com sucesso. Valor em conta: " + user.getAmount();
    }
}
