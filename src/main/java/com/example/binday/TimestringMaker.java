package com.example.binday;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TimestringMaker {
    private
    String day;
    String month;
    int date;
    Calendar cal = Calendar.getInstance();
    LocalDateTime ld = LocalDateTime.now();


    public TimestringMaker() {


        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = ld.format(myFormatObj);


    }


    public String getMonth() {

        return month;
    }

    public String getDay() {
        String day = String.valueOf(ld.getDayOfWeek());
        return day;
    }


}
