package report_card;

import java.util.Calendar;

/**
 * Created by pomortsew on 27.04.17.
 */
public class StringQueries {
    static Calendar calendar = Calendar.getInstance();
    private static int month = calendar.get(Calendar.MONTH) + 1;
    private static int monthNext = calendar.get(Calendar.MONTH) + 2;

    public static final String USERNAMEDB = "root";
    public static final String PASSWORDDB = "devel";
    public static final String URLDB = "jdbc:mysql://localhost:3306/sheme? useSSL = false&useUnicode=true&characterEncoding=UTF-8 ";
    public static final String CREATETABLE = "("
            + " ID INT(11) NOT NULL PRIMARY KEY  AUTO_INCREMENT,"
            + " DAY VARCHAR(3) NOT NULL, "
            + " SURNAME VARCHAR(15) NOT NULL ,"
            + " PERSONELL_NUMBER INT(10) NOT NULL,"
            + " WORCING_SHIFT VARCHAR(3) NOT NULL ,"
            + " LOCATION VARCHAR(3) NOT NULL )"
            + " MAX_ROWS =31";
    public static final String currentDataMonth = "_" + month + "_" + calendar.get(Calendar.YEAR);
    public static final String currentDataMonthNext = "_" + monthNext + "_" + calendar.get(Calendar.YEAR);
    public static final String SHOWTABLEDB ="SHOW TABLES FROM sheme";

    public static String ERROR = "";

}
