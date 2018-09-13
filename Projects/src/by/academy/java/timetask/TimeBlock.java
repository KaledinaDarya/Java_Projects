package by.academy.java.timetask;

public class TimeBlock {

    private int seconds, minutes, hours, timeInSeconds;

    public TimeBlock(int seconds, int minutes, int hours) {
        super();
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeBlock(int timeInSeconds) {
        super();
        this.timeInSeconds = timeInSeconds;
    }

    public String getTimeInSeconds() {
        int result;
        result = this.seconds + this.minutes * 60 + this.hours * 3600;
        return getText(result, "second") ;
    }

    public String getTime() {
        this.hours = this.timeInSeconds / 3600;
        timeInSeconds = this.timeInSeconds % 3600;
        this.minutes = this.timeInSeconds / 60;
        this.timeInSeconds = this.timeInSeconds % 60;
        this.seconds = this.timeInSeconds;
        return getText(this.hours, "hour") + getText(this.minutes, "minute") + getText(this.seconds, "second");
    }

    private static String getText(int time, String text) {

        String result, second, minute, hour;

        if (time == 0) {
            result = "";
        } else {
            switch (time % 10) {
                case 2:
                case 3:
                case 4:
                    second = " секунды ";
                    minute = " минуты ";
                    hour = " часа ";
                    break;
                case 1:
                    if (time % 100 != 11) {
                        second = " секунда ";
                        minute = " минута ";
                        hour = " час ";
                        break;
                    }
                default:
                    second = " секунд ";
                    minute = " минут ";
                    hour = " часов ";
            }

            switch (text) {
                case "minute":
                    result = time + minute;
                    break;
                case "hour":
                    result = time + hour;
                    break;
                default:
                    result = time + second;
            }
        }
        return result;
    }
}
