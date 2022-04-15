package day33_varargs_stringBuilder;

public class C06_strb {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("prize dikkat");

        System.out.println(sb1.insert(12," edin.")); // prize dikkat edin.

        String str="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,8)); // Hayatta prize dikkat edin.

        System.out.println(sb1.reverse()); // .nide takkid ezirp attayaH

        System.out.println(sb1.reverse()); // Hayatta prize dikkat edin.

        System.out.println( sb1.substring(3,5));  // at
        System.out.println(sb1); // Hayatta prize dikkat edin.

        System.out.println(sb1.subSequence(3,5)); // at
        System.out.println(sb1); // Hayatta prize dikkat edin.


    }
}
