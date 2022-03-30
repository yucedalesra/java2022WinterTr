package day11_StringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {


        // kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse, cevabini ve "derse katiliminiz alinmistir" yazdirin
        // hayir derse cevabini ve " sonraki derslerimize bekleriz" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Derse kayilmak ister misiniz? Evet veya Hayir yaziniz" );
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase(" evet ")){
            System.out.println("cevabiniz : " + cevap + "derse katiliminiz onaylanmistir" );
        }else if (cevap.equalsIgnoreCase(" hayir ")){

            System.out.println("cevabiniz : " + cevap + "Sonraki derslerimize bekleriz");
        }else {
            System.out.println("Lutfen evet veya hayir yaziniz");

        }


    }
}
