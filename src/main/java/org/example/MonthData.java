package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MonthData {
    private String title;
    private DayData[] days;
    public MonthData(){
        Calendar calendar = Calendar.getInstance();
        title = Month.values()[calendar.get(Calendar.MONTH)].toString();
        int dayMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        days = new DayData[dayMonth];
        for(int i = 0; i < dayMonth; i++){
            days[i] = new DayData();
        }
    }
    public String getStatsByMonth(){
        int averageSteps, minSteps, maxSteps, sumSteps;
        // for(DayData d : days)
        return null;
    }
    public String getTitle(){
        return title;
    }
    public enum Month{
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }
}
