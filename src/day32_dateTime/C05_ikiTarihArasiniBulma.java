package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dgunu= LocalDate.of(1995,11,03);
        System.out.println(Period.between(dgunu,bugun));  // P26Y 4M 28D

        System.out.println(Period.between(dgunu,bugun).getYears());

     // FIXME: 31.03.2022





    }
}
