package com.example.binday;

public class BankHoliday {

    private String month;
    String day;
    int date;
    String holidayName;

    public BankHoliday(String holidayName, String day, String month, int date, int year) {
        this.month = month;
        this.day=day;
        this.date = date;
        this.holidayName = holidayName;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public int getDate() {
        return date;
    }

    public String getHolidayName() {
        return holidayName;
    }
}
