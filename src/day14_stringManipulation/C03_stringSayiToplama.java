package day14_stringManipulation;

public class C03_stringSayiToplama {
    public static void main(String[] args) {

        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = “$13.99”
        // String str2 = “$10.55”
        // ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1= "13.99";
        String str2= "10.55";

        double num1 = Double.valueOf(str1);
        double num2 = Double.valueOf(str2);

        System.out.println("$"+(num1+num2)); // $24.54
    }
}
