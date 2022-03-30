package day27_constructor;

public class Z {

    String isim;
    String soyisim;
    int numara;
    boolean gercekMi;

    public Z(String ism, String sy, int no, boolean grc) {

    isim=ism;
    soyisim=sy;
    numara=no;
    gercekMi=grc;
    }

    public Z(String isim, String soyisim, int numara) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.numara=numara;
    }

    public String toString(){

        return ("Isim : "+ isim+ ", soyisim : "+ soyisim+ ", numara :"+ numara);
    }
}
