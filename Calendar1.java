/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.

	    int SundayFirst = 0;
	 	while (year != 2000) {
	 		System.out.print(dayOfMonth + "/" + month + "/" + year);
			if(dayOfWeek == 1) System.out.println(" Sunday");
			else System.out.println();
	 		advance();
			if(dayOfMonth == 1 && dayOfWeek == 1) SundayFirst++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		//if (debugDaysCounter == 36500) { 
	 		//	break;
	 		//}
        }
		System.out.println("During the 20th century, " + SundayFirst +  " Sundays fell on the first day of the month");
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {

		if(dayOfMonth == nDaysInMonth(month, year))	{
		dayOfMonth = 1;
		if(month == 12) {
				month = 1;
				year++;
			}
			else month++;
		} 
		else {
			dayOfMonth++;
		}
		if(dayOfWeek == 7) dayOfWeek =1;
		else dayOfWeek++;
	 }
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if(year % 400 == 0)
			return true;
		else if(year % 4 == 0 && year % 100 == 0)
				return false;
			else if(year % 4 == 0)
					return true;

	return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		switch(month) {
			case 1: return nDaysInMonth;
			case 3: return nDaysInMonth;
			case 4: return nDaysInMonth - 1;
			case 5: return nDaysInMonth;
			case 6: return nDaysInMonth - 1;
			case 7: return nDaysInMonth;
			case 8: return nDaysInMonth;
			case 9: return nDaysInMonth - 1;
			case 10: return nDaysInMonth;
			case 11: return nDaysInMonth - 1;
			case 12: return nDaysInMonth;
			case 2: { 
				if(isLeapYear(year)) return nDaysInMonth - 2;
					else return nDaysInMonth - 3;
			}
			default: return 0;
		}

	}
}
