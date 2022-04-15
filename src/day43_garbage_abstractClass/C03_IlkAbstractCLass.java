package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractCLass {

    public abstract void abstractMethod();

    /*
    abstract method'lar
    child class'larin MUTLAKA  override etmesi gereken method'lardir
    dolayisiyla HICBIR ZAMAN direkt calistirilmazlar
    ve bu sebeple method body'sine ihtiyac yoktur


    bir class'in veya method'un abstract olup olmadigini anlayabilir miyiz?
    --abstact yaziyorsa abstrac'tir, yazmiyorsa degildir
    (abs. olmayan class'lara concrete class/method denir)

    Abstract methodlar body'e sahip olamaz
    Concrete methodlar ise method body'si olmadan olusturulamaz

     */
}
