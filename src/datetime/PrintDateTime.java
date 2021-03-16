package datetime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateTime {

    public static void main(String[] args) {
        
        LocalDateTime dtNow = getTimeStamp();
        String dtString = getString(dtNow, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(dtString);
        String wkString = getString(dtNow, DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println(wkString);
    }
    
    private static String getString(LocalDateTime dtObj, DateTimeFormatter formatter) {
        String dateTimeString = dtObj.format(formatter);
        return dateTimeString;
    }
    
    private static LocalDateTime getTimeStamp() {
        LocalDateTime dtNowObj = LocalDateTime.now();
        return dtNowObj;
    }
        
}
