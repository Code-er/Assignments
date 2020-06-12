import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DurationDOBCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your D.O.B. in format yyyy-mm-dd");
		String d=sc.nextLine();
		DateTimeFormatter formatter=DateTimeFormatter.ISO_DATE;
		LocalDate start=LocalDate.parse(d,formatter);
		LocalDate end=LocalDate.now();
		
		
		Period period=start.until(end);
		System.out.println("Duration in regards to your date of birth:");
		System.out.println("Days:" + period.get(ChronoUnit.DAYS));
		System.out.println("Months:" + period.get(ChronoUnit.MONTHS));
		System.out.println("Years:" + period.get(ChronoUnit.YEARS));
		

	}

}
