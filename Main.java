package com;

import java.util.Scanner;

public class Main {
private static Scanner tara = new Scanner(System.in);
    public static void main(String[] args) {
Factory fc = new Factory();

        System.out.println("============================== NICKNAME FACTORY ==================================");
        //System.out.println("Kaç haneli isim oluşturulsun ? :");
//fc.karakterSayisi = tara.nextInt();
fc.createNickname();
        System.out.println("==================================================================================");
    }
}
