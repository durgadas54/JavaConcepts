package concepts;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByDate {
    public static void main(String[] args) {
        final  DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZonedDateTime t1 = ZonedDateTime.parse("2022-03-27T10:15:30+01:00[Europe/Paris]");
        ZonedDateTime t2 = ZonedDateTime.parse("2022-03-29T10:15:30+01:00[Europe/Paris]");
        ZonedDateTime t3 = ZonedDateTime.parse("2022-03-21T10:15:30+01:00[Europe/Paris]");
        ZonedDateTime t4 = ZonedDateTime.parse("2022-03-12T10:15:30+01:00[Europe/Paris]");
        ZonedDateTime t5 = ZonedDateTime.parse("2022-03-23T10:15:30+01:00[Europe/Paris]");

        List<ZonedDateTime> dateList = new ArrayList<>();
        dateList.add(t1);
        dateList.add(t2);
        dateList.add(t3);
        dateList.add(t4);
        dateList.add(t5);
        for(ZonedDateTime d1 : dateList){
            System.out.println(d1.toString());
        }
        Collections.sort(dateList, (o1, o2) -> {
            if (o1 == null || o2 == null) return -1;
            return o1.isAfter(o2)?1:-1;
        });
        System.out.println(" After sorting ");
        for(ZonedDateTime d1 : dateList){
            System.out.println(d1.toString());
        }
    }
}
