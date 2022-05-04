package com.example.binday;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TimestringMaker {
    private String day;
    String month;
    int date;
    Calendar cal = Calendar.getInstance();
    LocalDateTime ld = LocalDateTime.now();


    public TimestringMaker() {


        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = ld.format(myFormatObj);


    }


    public String getMonth() {
        month = String.valueOf(ld.getMonth());
        return month;
    }

    public String getDay() {
        day = String.valueOf(ld.getDayOfWeek());

        return day;
    }

    public int getDate() {
        date= ld.getDayOfMonth();
        return date;
    }
}
