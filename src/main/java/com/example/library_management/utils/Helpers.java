package com.example.library_management.utils;

import java.util.Date;
import java.util.Calendar;

public class Helpers {
    public static Date addDays(Date date, int days) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(date);
        calender.add(Calendar.DAY_OF_MONTH, days);
        Date newDate = calender.getTime();
        return newDate;
    }

    public static Date resetHours(Date date) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(date);
        calender.set(Calendar.HOUR_OF_DAY, 0);
        calender.set(Calendar.MINUTE, 0);
        calender.set(Calendar.SECOND, 0);
        calender.set(Calendar.MILLISECOND, 0);
        Date newDate = calender.getTime();
        return newDate;
    }
}
