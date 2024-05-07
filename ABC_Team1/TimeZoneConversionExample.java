package com.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/** Author: Nalini Kanta Pattanayak */
public class TimeZoneConversionExample {
    public static void main(String[] args) {
       // String inputDateTimeString = "2023-05-25T13:58:17.868Z";
    	String inputDateTimeString="2024-02-07T23:45:00.000-05:00";

        // Parse the input date and time
        ZonedDateTime userDateTime = ZonedDateTime.parse(inputDateTimeString, DateTimeFormatter.ISO_DATE_TIME);
        ZoneId zoneId = userDateTime.getZone();
        
        System.out.println("Input Zone:"+zoneId.getId());
        
        ZonedDateTime utcDateTimeNew = userDateTime.withZoneSameInstant(java.time.ZoneId.of("UTC"));

        // Convert to Asia/Kolkata time zone
        ZonedDateTime kolkataDateTime = userDateTime.withZoneSameInstant(java.time.ZoneId.of("Asia/Kolkata"));
        
        ZonedDateTime originalDateTimeNew = utcDateTimeNew.withZoneSameInstant(zoneId);

        // Format the result in a desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
        String result = kolkataDateTime.format(formatter);

        System.out.println("Original Date and Time : " + inputDateTimeString);
        System.out.println("UTC Date and Time : " + utcDateTimeNew);
        System.out.println("Converted to Asia/Kolkata: " + result);
        System.out.println("originalDateTimeNew: " + originalDateTimeNew);
    }
}

