package strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateandtimeformat {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 8, 4);
        System.out.println("Date: " + date); // 2025-08-04

        // Format date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Formatted: " + date.format(formatter)); // 04-08-2025
    }
}