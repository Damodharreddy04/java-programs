import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
public class datetime {
    public static void main(String[] args) {
        
        LocalTime time= LocalTime.now();
        LocalDate date=LocalDate.now();
        LocalDateTime datetime=LocalDateTime.now();
        System.out.println(time);
        System.out.println(date);
        System.out.println(datetime);

    }
   
    
}
