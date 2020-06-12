import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WarrantyDateCalculator {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter date of prchase in format yy-mm-dd");
        LocalDate purchaseDate=LocalDate.parse(scanner.next(), DateTimeFormatter.ISO_DATE);
        

		System.out.println("Enter warranty period years");
		int years=scanner.nextInt();
		
		System.out.println("warranty period months");
		int months=scanner.nextInt();
		
		purchaseDate=purchaseDate.plusMonths(months);
		purchaseDate=purchaseDate.plusYears(years);
		
		System.out.println("Warranty Expires on " + purchaseDate);
		
		
		
		
		
		
		
	}

}
