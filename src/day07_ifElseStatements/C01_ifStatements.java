package day07_ifElseStatements;

public class C01_ifStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {

            System.out.println("verilen sayilar esit");


        }

        if (a > 100) {
            System.out.println("a 100'den büyük");
        }

        if (a * b > 5) {

            System.out.println("sayilarin carpimi 5'ten büyük");
        }
        //bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        //bir sart ve o sarta bagli sonuca odaklidir
        //birden fayla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi gibi
        //hicbirinin body`si calismayabilir


    }
}
