package report_card;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by pomortsew on 27.04.17.
 */
public class Runer {
    public static void main(String[] args) throws IOException {

//        Date d = new Date();
//        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
//        SimpleDateFormat format2 = new SimpleDateFormat("MM_yyyy ");
//        SimpleDateFormat format3 = new SimpleDateFormat(" MM");
//        System.out.println(format1.format(d)); //25.02.2013 09:03
//        System.out.println(format2.format(d)); //День 25 Месяц 02 Год 2013 Время 09:03

//
//        Calendar calendar=Calendar.getInstance();
//        int m= calendar.get(Calendar.MONTH)+2;
//        int year=calendar.get(Calendar.YEAR);
//        int day=calendar.get(Calendar.DAY_OF_MONTH);
//        System.out.println(m+"  "+year+"    "+day);
//
//
//        Calendar c = new GregorianCalendar();//календарь на 25.11.2013
//        System.out.println(c.get(Calendar.MONTH));//11
//        System.out.println(c.get(Calendar.YEAR));//2013
//        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//4
//        System.out.println(c.get(Calendar.DAY_OF_WEEK));//4
//        System.out.println(c.get(Calendar.DAY_OF_YEAR));//359
//        System.out.println(c.get(Calendar.DAY_OF_MONTH));//25
//
        ActionProcessing ap=new ActionProcessing();

//        ap.createTable(ap.inputDataString());
//        ap.searh(ap.inputDataString());
        System.out.println(ap.allTableName());


    }
}
