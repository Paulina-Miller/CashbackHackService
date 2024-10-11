package ru.netology.service;

public class Main {
    public static void main(String[] args) {

        CashbackHackService cashbackHackService = new CashbackHackService();

        int amountSpent = 900;   // Пример потраченной суммы
        int amountToBuy = cashbackHackService.remain(amountSpent);

        System.out.println("Необходимо докупить: " + amountToBuy + " рублей");

    }
}