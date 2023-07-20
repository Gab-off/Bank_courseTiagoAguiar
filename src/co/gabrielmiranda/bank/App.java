package co.gabrielmiranda.bank;

public class App {
    public static void main(String[] args) {
        System.out.println("Olá mundo");

        Account account = new Account("0001", "1234", "Seu Barriga");

        boolean succeed = account.withDraw(200.0);
        if (!succeed) {
            System.out.println("Voce nao tem saldo suficiente para sacar");
        }

        account.deposit(100);
        account.deposit(50);
        account.deposit(100);

        if (!account.withDraw(200)) {
            System.out.println("Voce nao tem saldo suficiente para sacar");
        } else {
            System.out.println("Saque efetuado! Obrigado");
        }

        if (!account.withDraw(200)) {
            System.out.println("Voce nao tem saldo suficiente para sacar, verifique o extrato");
        } else {
            System.out.println("Saque efetuado! Obrigado");
        }
    }

}
