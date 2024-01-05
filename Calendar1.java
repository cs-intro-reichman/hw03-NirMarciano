public class Calendar1 {

    static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
    static int dayOfWeek = 2; 
	static int nDaysInMonth = 31;

    public static void main(String[] args) {
        
        int inYear = Integer.parseInt(args[0]); 

	 	while (year != inYear) {
	 		advance();
        }

        while(year != (inYear +1)) {
        System.out.print(dayOfMonth + "/" + month + "/" + year);
        if(dayOfWeek == 1) System.out.println(" Sunday");
			else System.out.println();
        advance();
        }
    
    }

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

     private static boolean isLeapYear(int year) {
		if(year % 400 == 0)
			return true;
		else if(year % 4 == 0 && year % 100 == 0)
				return false;
			else if(year % 4 == 0)
					return true;

	return false;
	}

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
