package day39_overriding;

public class Toyota extends Araba{

    String hiz= "Toyota araclar maks 220 km hiz yapar";
    String marka="Toyota";
    String mensei="Japonya";


    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanirlar");
    }

    public void garanti(){
        System.out.println("Toyota araclar 10 yil garantilidir");
    }

}
