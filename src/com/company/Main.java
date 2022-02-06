package com.company;

public class Main {
    public static void main(String[] args) {
        int paidAmount = 100013; // рублей потрачено на билет
        int amountForMile = 20;// рублей для одной бонусной милли

        int bonusMiles = paidAmount / amountForMile;//Рассчитываем количество бонусных милль, используя
        // значения заведённых переменных.
        System.out.println(bonusMiles);// выводим на экран
    }
}