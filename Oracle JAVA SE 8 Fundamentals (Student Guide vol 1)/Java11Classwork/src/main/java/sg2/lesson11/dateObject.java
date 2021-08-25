/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson11;

import java.time.*;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author User
 */
public class dateObject {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();
        myDate = myDate.plusDays(14);
        myDate = myDate.minusMonths(3);
//        JapaneseDate jDate = JapaneseDate.from(myDate);
        System.out.println("Todays date: " + myDate);
        
        String sDate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO  format: "+sDate);
        
        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Date in MEDIUM format: "+fDate);
    }
}
