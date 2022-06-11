package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, List> mapHumansAccounts = new HashMap<>();
        Human human = new Human();
        human.setNameHuman("petrov");
        AccountsHuman accountsHuman = new AccountsHuman();
        accountsHuman.addListAccountsHuman(456);
        accountsHuman.addListAccountsHuman(871263);
        accountsHuman.addListAccountsHuman(8762616);
        mapHumansAccounts.put(human.getNameHuman(), accountsHuman.getListAccountsHuman());
        System.out.println(mapHumansAccounts.entrySet());

        addAccounts(mapHumansAccounts);
        System.out.println("change map" + mapHumansAccounts.entrySet());

        addHuman(mapHumansAccounts);
        System.out.println("added Human" + mapHumansAccounts.entrySet());

        removeAccount(mapHumansAccounts);
        System.out.println("removed Account" + mapHumansAccounts.entrySet());

        removeHuman(mapHumansAccounts);
        System.out.println("removed Human" + mapHumansAccounts.entrySet());
    }

    public static Map addAccounts(Map<String, List> humanAccount) {
        System.out.println("Input name Human: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        List<Double> listAccounts = new ArrayList<>();
        if (humanAccount.containsKey(name)){
            listAccounts = humanAccount.get(name);
            System.out.println("Input account: ");
            double account = scanner.nextDouble();
            listAccounts.add(account);
            humanAccount.put(name, listAccounts);
        }
        else {
            System.out.println("Human " + name + " not found");
        }
        return humanAccount;
    }

    public static Map addHuman(Map<String, List> humanAccount) {
        System.out.println("Input name Human: ");
        Scanner scanner = new Scanner(System.in);
        String nameHuman = scanner.nextLine();
        List<Double> listAccounts = new ArrayList<>();
        if (humanAccount.containsKey(nameHuman)){
            System.out.println("Human " + nameHuman + "exists in the database");
            return humanAccount;
        }
        else {
            humanAccount.put(nameHuman, listAccounts);
            System.out.println("Human " + nameHuman + " added to database");
        }
        return humanAccount;
    }

    public static Map removeAccount(Map<String, List> humanAccount) {
        System.out.println("Input name Human for delete account: ");
        Scanner scanner = new Scanner(System.in);
        String nameHuman = scanner.nextLine();
        System.out.println("Input account for delete: ");
        double accDelete = scanner.nextDouble();
        List<Double> listAccounts = new ArrayList<>();
        listAccounts = humanAccount.get(nameHuman);
        listAccounts.remove(accDelete);
        humanAccount.put(nameHuman, listAccounts);
        return humanAccount;
    }

    public static Map removeHuman(Map<String, List> humanAccount) {
        System.out.println("Input name Human for delete: ");
        Scanner scanner = new Scanner(System.in);
        String nameHuman = scanner.nextLine();
        humanAccount.remove(nameHuman);
        return humanAccount;
    }
}
