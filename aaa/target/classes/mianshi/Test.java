package mianshi;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by xiafeng on 15/12/1.
 * 日历
 */
public class Test {


    public static void main(String[] args){
        GregorianCalendar d = new GregorianCalendar();
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);
        d.set(Calendar.DAY_OF_MONTH,1);
        int weekday = d.get(Calendar.DAY_OF_MONTH);
       int firstDayOfWeek = d.getFirstDayOfWeek();
        int indent = 0;
        while (weekday != firstDayOfWeek){
            indent++;
            d.add(Calendar.DAY_OF_MONTH,-1);
            weekday = d.get(Calendar.DAY_OF_MONTH);
            String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
            do{
                System.out.printf("%4s", weekdayNames[weekday]);
                d.add(Calendar.DAY_OF_MONTH,1);
                weekday = d.get(Calendar.DAY_OF_MONTH);
            }
            while (weekday!=firstDayOfWeek);
            System.out.println();

            for(int i=1;i<=indent;i++)
                System.out.println("   ");
            d.set(Calendar.DAY_OF_MONTH,1);
            do {
                int day = d.get(Calendar.DAY_OF_MONTH);
                System.out.printf("%3d",day);
                if(day==today) System.out.print("*");
                else System.out.print(" ");
                d.add(Calendar.DAY_OF_MONTH,1);
                weekday = d.get(Calendar.DAY_OF_WEEK);
                if(weekday == firstDayOfWeek) System.out.println();
            }
            while (d.get(Calendar.MONTH) == month);
            if(weekday != firstDayOfWeek) System.out.println();
        }

    }
}
