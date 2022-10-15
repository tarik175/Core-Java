package day19passbyvaluedaytimeclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        Date date1=new Date();
        System.out.println(date1.getTime());//1664144337027 ==> Returns the number of miliseconds since January 1, 1970

        System.out.println(LocalDate.now());;//Returns the current date using the system clock and default time-zone, not null

        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));//2022-09-26

        //How to get future dates
        System.out.println(LocalDate.now().plusDays(200));//2023-04-14
        System.out.println(LocalDate.now().plusMonths(25));//2024-10-26
        //How to get past dates
        System.out.println(LocalDate.now().minusWeeks(7));//2022-08-08
        System.out.println(LocalDate.now().plusYears(2).minusWeeks(5));//2024-08-22

        System.out.println(LocalTime.now());//01:40:33.548780200

        System.out.println(LocalTime.now().getHour());//1
        System.out.println(LocalTime.now().getMinute());//42

        System.out.println(LocalTime.now().getHour()+ ":"+LocalTime.now().getMinute());//1:42

        System.out.println(LocalTime.now().isAfter(LocalTime.of(20,12,35)));
        System.out.println(LocalTime.now().isBefore(LocalTime.of(20,12,35)));

        //Compare 2 birthdays. Ali:02/13/2005(american) Veli:03/01/2007(american)
        LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));

        System.out.println(LocalDate.now().getDayOfWeek());//MONDAY
        System.out.println(LocalDate.now().getMonth());//SEPTEMBER
        System.out.println(LocalDate.now().getMonthValue());//9

        System.out.println(LocalDateTime.now());//2022-09-26T01:57:22.513258200
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo")));//2022-09-26T01:58:53.574141100+09:00[Asia/Tokyo]
            //2022.06.11

    }
}
