package day12_localdatetimevarargsoverloadingoverriding;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class C01_LocalDateTime {
    public static void main(String[] args) {
        /* Tom 29 Ekim 1923 tarihinden 45 yil 8 ay 5 gun sonra dogdu.
           Veli 15 Eylul 1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
           Tom ve Veli'nin dogum tarihini hesaplayan kodu yazıniz.
           Tom ve Veli'nin dogum tarihlerinin aynı olup olmadığını kontrol eden kodu yazıniz.
         */
        LocalDate tom= LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate veli = LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(tom);
        System.out.println(veli);


        //Japonya ile Almanya arasindaki saat farkini saat cinsinden hesaplatan kodu yaziniz

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long diff = ChronoUnit.HOURS.between(germany,japan);
        System.out.println(diff);
    }
}
