import java.lang.StringBuilder;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class getFromHTML {

	/**
	 * Gets the team score and increases score dependent on the input of boolean array or int named "teamChoice"
	 * @param htmlIn
	 * @param teamChoice
	 * @param score
	 * @return retVal (String)
	 */
	public static String getTeamScore(String htmlIn, boolean[] teamChoice, int score) //public static String getTeamScore(String htmlIn, int teamChoice, int score)
	{
		
		/**
		 * 
		 * Gets the ends of the scores
		 *
		 */
		int[] ends = new int[4];
		ends[0] = htmlIn.indexOf("</td>");
		for(int i=1;i<4;i++)
		{
			ends[i] = htmlIn.indexOf("</td>", ends[i-1] + 1);
		}
		/**
		 * 
		 * Creates a modifiable string
		 *
		 */
		StringBuilder[] numbersText = {new StringBuilder(""),new StringBuilder(""),new StringBuilder(""),new StringBuilder("")};
		
		/**
		 * 
		 * Manage difference and beginning of first score then append the score onto the blank strings
		 *
		 */
		int start = 4;
		int difference = Math.abs(start - ends[0]);
		
		for (int i=start;i<start + difference;i++)
		{
			numbersText[0].append(htmlIn.charAt(i));
		}
		
		/**
		 * 
		 * Same as above for scores 2,3, and 4
		 *
		 */
		for(int i=1;i<4;i++)
		{
			start = ends[i-1] + 9;
			difference = Math.abs(ends[i] - start);
			
			for (int j=start;j<start + difference;j++)
			{
				numbersText[i].append(htmlIn.charAt(j));
			}
		}
		
		/**
		 * 
		 * Converts scores into integers for modifications
		 *
		 */
		int[] scores = new int[4];
		for(int i=0;i<4;i++)
		{
			scores[i] = Integer.valueOf(numbersText[i].toString());
		}
		
		/**
		 * 
		 * Applies the score change
		 * 
		 */
		for(int i=0;i<4;i++)
		{
			if(teamChoice[i] == true)
				scores[i] += score;
			/* //------------------------------------------------if using int for team identifier
			if(teamChoice == i)
				scores[i] += score;
			*/
		}
		
		/**
		 * 
		 * Returns the new line with new scores
		 *
		 */
		String retVal = "<td>" + scores[0] + "</td>" +"<td>" + scores[1] + "</td>" +"<td>" + scores[2] + "</td>" +"<td>" + scores[3] + "</td>" ;
		return retVal;}
	
	/**
	 * 
	 * @param htmlIn
	 * @return score(String)
	 * 
	 */
	public static int getScoreFromRow(String htmlIn) {
		
		/**
		 * 
		 * Extract and Test the row number that decides the value of the question being answered
		 */
		String rowNumber = Character.toString(htmlIn.charAt(17));
		try {Integer.valueOf(rowNumber);}catch(NumberFormatException e) { System.out.println("Unable to determine Row"); return -1;}
		
		/**
		 * 
		 * Since rows are in order of "1,2,3,4,5" with score values of "200,400,600,800,1000", scores have a 1:200 ratio, so score = row * 200.
		 * 
		 */
		int rowInt = Integer.valueOf(rowNumber);
		int score = rowInt * 200;
		 /**
		  * return the score
		  */
		return score;
		
	}
	
//----------------------------------------------------------------------------------------
	/**
	 * Attempt to edit a button in HTML from Java>Javascript>HTML
	 * @param buttonIn
	 * @return
	 * @throws Exception
	 */
	public static String disableButton(String buttonIn) throws Exception{
		ScriptEngineManager scriptManager = new ScriptEngineManager();
		ScriptEngine scriptEngine = scriptManager.getEngineByName("JavaScript");
		Invocable jSInvocable = (Invocable) scriptEngine;
		scriptEngine.eval("load('disableButton.js')");
		Object jSFunc = scriptEngine.get("disableButton");
		Object retValObj = jSInvocable.invokeMethod(jSFunc, "disable", buttonIn);
		String retVal = retValObj.toString();
		return retVal;
	}
}
