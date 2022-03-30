package day18_nestedForLoop;

public class C03_nestedForLoop {
    public static void main(String[] args) {

       //Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin
        // ve girilen rakama gore asagidaki sekli cizdirin
        //        *
        //        * *
        //        * * *
        //        * * * *

        int input=5;
        int input2 =8;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=input2 ; j++) {

                //nested for loop ya kare ya dikdörtgen ya da ucgen formatinda olabilir
                // dikdörtgen istedigimizde iki loop icin de bagimsiz en point belirleriz
                //ücgen sekli vermek icin inner loop'un end point'ini outer degiskene bagli


                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
