import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class DateTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime current = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(today);
        System.out.println(current);
        System.out.println(dt);
    }
}
