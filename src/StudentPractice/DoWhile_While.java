package StudentPractice;

import java.util.Scanner;

public class DoWhile_While {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hataliGiris = 0;
        do {
            System.out.println("Kullanıcı adı gir");
            String username = scan.next();
            System.out.println("şifre gir");
            String password = scan.next();
            if (password.equals("pwd123") && username.equals("admin")) {
                System.out.println("Bilgileriniz Doğrudur\n"+"------HOŞGELDİNİZ-------");
                break;
            } else {
                System.out.println("Bilgilerinizi yanlış girdiniz, tekrar deneyiniz");
                hataliGiris++;
                System.out.println("kalan hak : "+(3-hataliGiris));
            }
            if (hataliGiris == 3) {
                System.out.println("Yanlış Giriş Sınırına Ulaştınız, Hesabınız Bloke edildi!");
            }

        } while (hataliGiris < 3);

    }}