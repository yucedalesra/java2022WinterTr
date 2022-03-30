package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a= 10;
        int b= 20;

        if (a<b && b<100){

            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }

        if (a>0) System.out.println("suslu parantez olmazsa sadece 1 parantez calisir");
        //bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        //if body'sini {} icine yazmalisiniz
        //body'i {} icine yazmaysak da if ciúmlesi calisir
        // ancak ilk ; gordugunde if cumlsi bitmis olur


        //24.satirdaki kod 15.satirdaki if dogru da false da olsa calisir

        System.out.println("2.satir calisti");
    }
}
