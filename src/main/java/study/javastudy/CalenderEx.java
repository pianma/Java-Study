package study.javastudy;

import java.util.Calendar;

public class CalenderEx {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("YEAR : " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH : " + calendar.get(calendar.MONTH+1)); // 0월부터 11월까지 표시되므로 +1을 해야함
        System.out.println("DATE : " + calendar.get(calendar.DATE) );

        System.out.println("HOUR : " + calendar.get(calendar.HOUR) ); // 12H로 표현
        System.out.println("HOUR_OF_DAY : " + calendar.get( calendar.HOUR_OF_DAY)); // 24H로 표현
        System.out.println("MINUTE : " + calendar.get(calendar.MINUTE) );

        calendar.add(calendar.HOUR, 5); // 5시간후
        System.out.println("5시간 후 : " + calendar.get(calendar.HOUR_OF_DAY) );
    }
}
