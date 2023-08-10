package study.javastudy;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString()); //현재 날짜

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss");
        System.out.println(dateFormat.format(date));

        long today = System.currentTimeMillis();
        System.out.println(today);

        System.out.println(today - date.getTime());
    }
}
