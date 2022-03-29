package BasicPracticeJava_ElifHoca;

public class BookClass {
    String adi, yazari;
    int yayinYili;


    // class'da body icinde
    // sag click--> generate--> kullaniacak parametreler ctrl ile add-->ok(Parametreli cons. olusturulur)

    public BookClass(String adi, String yazari, int yayinYili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }

    public BookClass(String adi, String yazari) {
        this.adi = adi;
        this.yazari = yazari;

    }

    public void display(){
        System.out.println("Kitap : " + adi + " Yazar : " +yazari + " Yayin Yili : " +yayinYili);

    }

    public static void main(String[] args) {
        BookClass kitap1 = new BookClass("Harry Potter and The Goblet of Fire", "JK Rowling", 2000);
        kitap1.display();
    }
}
