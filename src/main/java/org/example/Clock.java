package org.example;

public class Clock implements Readable {
    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void tick() {
        this.sec = (sec + 1);
        System.out.println("Метод tick() вернул " + this.sec);
    }

    @Override
    public void readTime() {
        System.out.println("Текущее время: " + this.hour + ":" + this.min + ":" + this.sec);
    }
}
