package day10_01032026;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateTime {

	public static void main(String[] args) {
		/*
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now()); 
       */
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
		//ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
		//ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone); 
		System.out.println(zoned1);
		System.out.println(ZoneId.systemDefault());
		
		Duration daily = Duration.ofDays(30); // PT24H
		System.out.println(daily);
		LocalDateTime dateTime = LocalDateTime.of(2028,02,28,23,00);
		Duration duration = Duration.of(2,ChronoUnit.HOURS);
		System.out.println(dateTime.plus(duration));
	}

}
