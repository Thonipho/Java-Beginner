/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson11;

import java.time.*;
import java.time.chrono.*;

/**
 *
 * @author User
 */
public class dateObject {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();
        IndiaDate jDate = IndiaDate.from(myDate);
        System.out.println("Todays date:" + myDate);
        
    }
}
