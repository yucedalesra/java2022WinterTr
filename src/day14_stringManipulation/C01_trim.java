package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str = "      Siz ne derseniz deyin, Java bildigini okur.  ";
        System.out.println(str);
        System.out.println(str.length()); //51


        System.out.println(str.trim());  // Basta ve sonda olan bosluklari keser. 43
        System.out.println(str.length());


        str = str.trim();
        System.out.println(str);
        System.out.println(str.length());




    }
}
