public static int dayOfYear(int month, int dayOfMonth, int year) {
    switch (month) {
	case 12:  dayOfMonth += 31;
	case 11: dayOfMonth += 30;
	case 10: dayOfMonth += 31;
	case 9:  dayOfMonth += 30;
	case 8: dayOfMonth += 31;
	case 7: dayOfMonth += 31;
	case 6: dayOfMonth += 30;
	case 5: dayOfMonth += 31;
	case 4: dayOfMonth += 30;
	case 3: dayOfMonth += 31;
	case 2: dayOfMonth += 28; //Leap Years??
	case 1: break;
	default: 
		System.out.println("Invalid month number");
	}
    return dayOfMonth;
}
