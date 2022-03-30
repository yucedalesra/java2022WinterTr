package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        // concatination yapmak icin iki ihtimalimiz var
        // istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz
        // veya String

        String str1 = "Java";
        String str2 = "Candir";

        //Java  Candir yazdiralim

        System.out.println(str1 +" " +str2);

        String cumle = str1.concat(str2); // JavaCandir

        cumle= str1.concat(" ").concat(str2); //Java Candir

        System.out.println(cumle);

        // concat icine String degil de sayi veya boolean deger yazarsak kabul etmez
        // concat methodu icine String parametre ister
        // String disinda bir data turu yazdiginizda onu String bir data türüne getirmelisiniz
        // cumle  =str1.concat(5); KABUL EDILMEZ


    }
}
