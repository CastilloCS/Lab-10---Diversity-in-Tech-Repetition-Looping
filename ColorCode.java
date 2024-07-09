/**
* This class provides several useful constants for ANSI colors and is part of the
* CS111 course material at MiraCosta College 2020
*
* @author Nery Chapeton-Lamas <nery@miracosta.edu>
*
* @version 1.0
*/

public class ColorCode
{
	// CONSTANT VARIABLES
	public static final String RESET = "\u001B[0m";
	public static final String BLINK = "\u001B[5m";
	
	public static final String TEXT_BLACK = "\u001B[30m";
	public static final String TEXT_RED = "\u001B[31m";
	public static final String TEXT_GREEN = "\u001B[32m";
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_BLUE = "\u001B[34m";
	public static final String TEXT_PURPLE = "\u001B[35m";
	public static final String TEXT_CYAN = "\u001B[36m";
	public static final String TEXT_WHITE = "\u001B[37m";
	
	public static final String TEXT_BLACK_BOLD = "\033[1;30m";
    public static final String TEXT_RED_BOLD = "\033[1;31m";
    public static final String TEXT_GREEN_BOLD = "\033[1;32m";
    public static final String TEXT_YELLOW_BOLD = "\033[1;33m";
    public static final String TEXT_BLUE_BOLD = "\033[1;34m";
    public static final String TEXT_PURPLE_BOLD = "\033[1;35m";
    public static final String TEXT_CYAN_BOLD = "\033[1;36m";
    public static final String TEXT_WHITE_BOLD = "\033[1;37m";
    
    //background colors
	public static final String BG_BLACK = "\u001B[40m";
	public static final String BG_RED = "\u001B[41m";
	public static final String BG_GREEN = "\u001B[42m";
	public static final String BG_YELLOW = "\u001B[43m";
	public static final String BG_BLUE = "\u001B[44m";
	public static final String BG_PURPLE = "\u001B[45m";
	public static final String BG_CYAN = "\u001B[46m";
	public static final String BG_WHITE = "\u001B[47m";
}