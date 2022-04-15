package day33_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Yasasin Java");

        System.out.println(sb1.indexOf("Java")); // 8
        System.out.println(sb1.lastIndexOf("s")); //4

        System.out.println(sb1.replace(0,7,"ne guzel"));
        System.out.println(sb1); // ne guzel Java

        System.out.println(sb1.toString().toUpperCase()); // NE GUZEL JAVA

        System.out.println(sb1); //ne guzel Java


        System.out.println(sb1.delete(0,3)); // guzel Java

        System.out.println(sb1);

    }
}
