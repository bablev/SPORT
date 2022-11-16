package org.example;

import java.util.Date;

public class DayData {
    private int counterSteps;
    private Date currentDate;

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public int getCounterSteps() {
        return counterSteps;
    }

    public void setCounterSteps(int counterSteps) {
        this.counterSteps = counterSteps;
    }
}
