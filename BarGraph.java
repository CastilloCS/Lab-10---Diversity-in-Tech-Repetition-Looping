/**
* Horizontal bar graph creation for integer values
*
* @author Nery Chapeton-Lamas <nery@miracosta.edu>
*
* @version 1.0
*/

public class BarGraph
{
	// CONSTANT VARIABLES
	public static final int  BLOCK_VALUE = 8;
	public static final char BLOCK_EIGTH_1 = '▏'; // 1/8 (eigth) block
	public static final char BLOCK_EIGTH_2 = '▎'; // 2/8 (quarter) block
	public static final char BLOCK_EIGTH_3 = '▍'; // 3/8 block
	public static final char BLOCK_EIGTH_4 = '▌'; // 4/8 (half) block
	public static final char BLOCK_EIGTH_5 = '▋'; // 5/8 block
	public static final char BLOCK_EIGTH_6 = '▊'; // 6/8 (three quarters) block
	public static final char BLOCK_EIGTH_7 = '▉'; // 7/8 block
	public static final char BLOCK_EIGTH_8 = '█'; // 8/8 (full) block

	// (public) STATIC METHODS
	
	/**
	 * Returns horizontal bar graph with value at end (graph and value separated by a space)
	 * 
	 * @param value number to base graph off of
	 * 
	 * @return String of complete horizontal bar graph with value at end (no new line)
	 */
	public static String getHorizontal(int value)
	{
		return BarGraph.getHorizontal(value, true);
	}
	
	/**
	 * Returns horizontal bar graph, allowing control of value being shown at end or not (if so,
	 * graph and value separated by a space)
	 * 
	 * @param value number to base graph off of
	 * @param showValue controls if value (integer) should be shown after bar graph
	 * 
	 * @return String of complete horizontal bar graph (no new line)
	 */
	public static String getHorizontal(int value, boolean showValue)
	{
		String bar = BarGraph.getFullPart(value);
		
		//add last part only if it exists
		if (value % BLOCK_VALUE > 0)
		{
			bar += BarGraph.getLastPart(value);
		}
		
		//show value if caller wants it
		if(showValue)
		{
			bar += " " + value;
		}
		
		return bar;
	}
	
	
	//HELPER METHODS (private static methods)
	
	/**
	 * Helper method building most of graph, the majority of it made by whole blocks (factors of
	 * the block value)
	 * 
	 * @param value total bar graph value, used to determine size of most of graph (whole blocks)
	 * 
	 * @return String of blocks that account for most of graph (whole parts)
	 */
	private static String getFullPart(int value)
	{
		int bars = value / BLOCK_VALUE;
		String result = "";
		
		for(int i = 0; i < bars; i++)
		{
			result += BLOCK_EIGTH_8;
		}
		
		return result;
	}
	
	/**
	 * Helper method to determine last portion of graph (that isn't the full block value),
	 * assume this is only called when a remainder exists
	 * 
	 * @param value total bar graph value, used to determine size of last piece of graph
	 * 
	 * @return character that represents final piece (fraction of whole block)
	 */
	private static char getLastPart(int value)
	{
		int leftover = value % BLOCK_VALUE; //can only have value of 0 to (BLOCK_VALUE-1)
		char lastPart;
		
		switch(leftover)
		{
			case 1:
				lastPart = BLOCK_EIGTH_1;
				break;
			case 2:
				lastPart = BLOCK_EIGTH_2;
				break;
			case 3:
				lastPart = BLOCK_EIGTH_3;
				break;
			case 4:
				lastPart = BLOCK_EIGTH_4;
				break;
			case 5:
				lastPart = BLOCK_EIGTH_5;
				break;
			case 6:
				lastPart = BLOCK_EIGTH_6;
				break;
			case 7:
				lastPart = BLOCK_EIGTH_7;
				break;
			case 8:
				lastPart = BLOCK_EIGTH_8;
				break;
			default:
				lastPart = 'E'; //for Error
				break;
		}
		
		return lastPart;
	}
}