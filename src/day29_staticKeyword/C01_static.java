package day29_staticKeyword;

public class C01_static {

    String okulIsmi = "Yildiz Koleji";
    static String okulTelefonu="31515343";

    public static void staticMethod(){
        System.out.println("Statik method calisti");
    }
    public void statikOlmayanMethod(){
        System.out.println("Statik olmayan method calisti");
    }
}
