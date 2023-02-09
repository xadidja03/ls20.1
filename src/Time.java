public class Time {
    public int hour;
    public int minute;
    public int second;
    public int nanosecond;
    @CustomManageTime(value = 23)
    public int getHour() {
        return hour;
    }
    @CustomManageTime(value = 11)

    public int getMinute() {
        return minute;
    }
    @CustomManageTime(value = 48)
    public int getSecond() {
        return second;
    }
    @CustomManageTime(value = 234)

    public int getNanosecond() {
        return nanosecond;
    }
}