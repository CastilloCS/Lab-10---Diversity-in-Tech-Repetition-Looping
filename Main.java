// PARTNER NAME: 
// PARTNER NAME: 
// CS111 SECTION #: 
// DATE: 

public class Main
{
	//CONSTANT VARIABLES
	public static final String DASH_LINE = " " + UtilityBelt.getLine(90, '-');
	
	/*
	 * ALGORITHM:
	 * - OUTPUT welcome message
	 * - OUTPUT table header
	 * - OUTPUT row of data (company, year, demographic numbers) for Amazon
	 * - OUTPUT row of data (company, year, demographic numbers) for Apple
	 * - OUTPUT row of data (company, year, demographic numbers) for Facebook
	 * - OUTPUT row of data (company, year, demographic numbers) for Google
	 * - OUTPUT row of data (company, year, demographic numbers) for Microsoft
	 */
	public static void main(String[] args)
	{
		Main.printWelcome();
		
		//output table
		System.out.println(DASH_LINE);
		Main.printTableHeader();
		System.out.println(DASH_LINE);
		Main.printTableRow("Amazon", 2017, 39, 48, 13, 13, 21);
		Main.printTableRow("Apple", 2017, 32, 54, 21, 13, 9);
		Main.printTableRow("Facebook", 2017, 35, 49, 40, 5, 3);
		Main.printTableRow("Google", 2017, 31, 56, 35, 4, 2);
		Main.printTableRow("Microsoft", 2017, 26, 56, 31, 6, 4);
		System.out.println(DASH_LINE);
		
		System.out.println("\nData/inspiration from https://informationisbeautiful.net/visualizations/diversity-in-tech/");
	}
	
	/**
	 * Prints one row of data for table, beautifully and cleanly formatted
	 */
	public static void printTableRow(String company, int year, int female, int white, int asian, int latinx, int black)
	{
		System.out.printf("| %-11s | %-4d | %-11s | %-11s | %-11s | %-11s | %-11s |%n",
			company, year,
			BarGraph.getHorizontal(female),
			BarGraph.getHorizontal(white),
			BarGraph.getHorizontal(asian),
			BarGraph.getHorizontal(latinx),
			BarGraph.getHorizontal(black));
	}
	
	/**
	 * Print header for table, beautifully and cleanly formatted
	 */
	public static void printTableHeader()
	{
		String colorFormat = ColorCode.TEXT_WHITE_BOLD;
		
		System.out.printf("|" + colorFormat + " %-11s " + ColorCode.RESET + "|" +
								colorFormat + " %-4s " + ColorCode.RESET + "|" +
								colorFormat + " %-11s " + ColorCode.RESET + "|" +
								colorFormat + " %-11s " + ColorCode.RESET + "|" +
								colorFormat + " %-11s " + ColorCode.RESET + "|" +
								colorFormat + " %-11s " + ColorCode.RESET + "|" +
								colorFormat + " %-11s " + ColorCode.RESET + "|%n",
			UtilityBelt.getCentered(11, "Company"),
			UtilityBelt.getCentered(4, "Year"),
			UtilityBelt.getCentered(11, "Female"),
			UtilityBelt.getCentered(11, "White"),
			UtilityBelt.getCentered(11, "Asian"),
			UtilityBelt.getCentered(11, "Latinx"),
			UtilityBelt.getCentered(11, "Black"));
	}
	
	/**
	 * Print dynamic welcome message for Diversity in Tech program
	 * NOTE: blinking shows up in lab project, doesn't work in regular repl.it :(
	 */
	public static void printWelcome()
	{
		System.out.println(ColorCode.TEXT_YELLOW + "\t  _____  _                    _ _           _         _______        _     ");
		System.out.println(ColorCode.TEXT_GREEN + "\t |  __ \\(_)                  (_) |         (_)       |__   __|      | |    ");
		System.out.println(ColorCode.TEXT_RED + "\t | |  | |___   _____ _ __ ___ _| |_ _   _   _ _ __      | | ___  ___| |__  ");
		System.out.println(ColorCode.TEXT_PURPLE + "\t | |  | | \\ \\ / / _ \\ '__/ __| | __| | | | | | '_ \\     | |/ _ \\/ __| '_ \\ ");
		System.out.println(ColorCode.TEXT_BLUE + "\t | |__| | |\\ V /  __/ |  \\__ \\ | |_| |_| | | | | | |    | |  __/ (__| | | |");
		System.out.println(ColorCode.TEXT_CYAN + "\t |_____/|_| \\_/ \\___|_|  |___/_|\\__|\\__, | |_|_| |_|    |_|\\___|\\___|_| |_|");
		System.out.println(ColorCode.TEXT_WHITE + "\t                                     __/ |                                 ");
		System.out.println(ColorCode.TEXT_WHITE + "\t                                    |___/     "
			+ ColorCode.BLINK + "JAVA Edition" + ColorCode.RESET + "                 ");
		
		System.out.println(ColorCode.TEXT_WHITE_BOLD + "\n\n\t\t\tEmployee breakdown of key technology companies\n" + ColorCode.RESET);
	}
}