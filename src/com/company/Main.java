package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bloc blocA1 = new Bloc(12, "1");
        Bloc blocB2 = new Bloc(3, "4");
        Bloc blocD4 = new Bloc(3, "5", "ANVA");
        Scanner scan = new Scanner(System.in);
        System.out.println( "Care este numele blocului?");
        String numeBloc = scan.nextLine();
        blocA1.setNumeBloc(numeBloc);
        String adresa = blocA1.getAdresa();
        System.out.println(adresa);
        System.out.println("Introduceti pretul pe etaj.");
        int pret = scan.nextInt();
        scan.nextLine();
        blocA1.setPretPeEtaj(pret);
        int total = blocA1.pretTotal();
        System.out.println( "Te costa : " + total);
    }
}
