package by.academy.java.timetask;
import java.util.Scanner;

public class TimeTask {

    public static void main(String[] args) {

        int seconds, minutes, hours;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите общее количество секунд:");
        seconds = in.nextInt();
        TimeBlock timeBlock = new TimeBlock(seconds);
        System.out.println(timeBlock.getTime());

        System.out.println("Введите по отдельности через Enter");
        System.out.print("секунды: ");
        seconds = in.nextInt();
        System.out.print("минуты: ");
        minutes = in.nextInt();
        System.out.print("часы: ");
        hours = in.nextInt();
        timeBlock = new TimeBlock(seconds, minutes, hours);
        System.out.println(timeBlock.getTimeInSeconds());
    }
}
