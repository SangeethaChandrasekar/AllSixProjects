import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
/*public class UTC {
    public static void uTC() {
        long time= 1427723278405L;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(simpleDateFormat.format(new Date(time)));
    }
}*/

public class UTC {
    public static OffsetDateTime uTC(){
        System.out.println("IST Time is:"+new Date());
        System.out.println("UTC Time is: "+getCurrentUtcTime());
        return getCurrentUtcTime();
    }

    public static OffsetDateTime getCurrentUtcTime() {
        OffsetDateTime dateTime;
        dateTime = OffsetDateTime.now(ZoneOffset.UTC);
        return dateTime;
    }
}