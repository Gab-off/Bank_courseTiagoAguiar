package co.gabrielmiranda.bank;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank santander = new Bank("0001");

        while(true) {
            System.out.println("O que deseja fazer? C=Criar conta; E=Sair do programa");
            String op = scanner.nextLine();

            if (op.equals("C")) {
                System.out.println("Digite o seu nome:");
                String name = scanner.nextLine();
                Account account = santander.generateAccount(name);
                santander.insertAccount(account);

                operateAccount(account);
            } else if (op.equals("E")) {
                break;
            } else {
                System.out.println("Comando inválido, tente novamente");
            }
        }
        List<Account> accountList = santander.getAccounts();
        accountList.forEach(System.out::println);

        santander.outputTotal();
        scanner.close();
    }

    static void operateAccount(Account account) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("O que deseja fazer? D=Deposito, S=Saque, E=Sair da conta");
            String op = scanner.nextLine().toUpperCase();
            if (op.equals("D")) {
                System.out.println("Qual valor deseja depositar?");
                double value = scanner.nextDouble();
                account.deposit(value);
            } else if (op.equals("S")) {
                System.out.println("Qual valor deseja sacar?");
                double value = scanner.nextDouble();
                if (!account.withDraw(value)) {
                    System.out.println("Ops! Não foi possível sacar o valor R$" + value);
                }
            } else if (op.equals("E")) {
                break;
            } else {
                System.out.println("Comando inválido, tente novamente!");
            }
            scanner = new Scanner(System.in);
        }
    }
}
