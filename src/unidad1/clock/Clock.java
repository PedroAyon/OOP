package unidad1.clock;

import java.time.LocalTime;

/**
 * @author Pedro Ayon
 */
public class Clock {
    int hour, minute, second;

    public Clock() {
        this.hour = 12;
    }

    public Clock(int hour, int minute, int second) {
        if (checkTimeBounds(hour, minute, second)) return;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour) {
        if (checkTimeBounds(hour)) return;
        this.hour = hour;
    }

    public void setTime(int hour, int minute) {
        if (checkTimeBounds(hour, minute)) return;
        this.hour = hour;
        this.minute = minute;
    }

    public void setTime(int hour, int minute, int second) {
        if (checkTimeBounds(hour, minute, second)) return;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime() {
        LocalTime now = LocalTime.now();
        this.hour = now.getHour();
        this.minute = now.getMinute();
        this.second = now.getSecond();
    }

    private boolean checkTimeBounds(int hour) {
        if (hour >= 0 && hour <= 23) return false;
        System.out.println("Can't assign this time.");
        return true;
    }

    private boolean checkTimeBounds(int hour, int minute) {
        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59)) return false;
        System.out.println("Can't assign this time.");
        return true;
    }

    private boolean checkTimeBounds(int hour, int minute, int second) {
        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) return false;
        System.out.println("Can't assign this time.");
        return true;
    }

    @Override
    public String toString() {
        return String.format("The time is %02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
