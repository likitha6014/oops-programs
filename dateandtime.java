package strings;
import java.util.Date;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class dateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(2025,7, 4); // Year = 1900+2025=3925, Month = August (0-based index)
		System.out.println(d1.toString());
		Date d2 = new Date(2024, 7, 4); // Year = 2024-1900, Month = August
		System.out.println("Date d1 is after Date d2 : " + d1.after(d2));
		System.out.println("Date d1 is before Date d2 : " + d1.before(d2));
		System.out.println("Your comparison value is : " + d1.compareTo(d2));
		System.out.println("Your comparison value is : " + d1.equals(d2));
		System.out.println("Your comparison value is : " + d1.getTime());


	}

}
