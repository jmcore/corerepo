import java.util.Formatter;
public class mainTest {

	public static void main(String[] args) {
		String inputString = "<td>200</td><td>800</td><td>5000</td><td>2400000</td>";
		String htmlIn = "HereDoesntMatter>2<ThatDoesThough";
		int testScore = getFromHTML.getScoreFromRow(htmlIn);
		
		//All teams will be adjusted for testing purposes
		boolean[] teamChoice = {true, true, true, true};
		//I made it possible to make this an int in the class with only 2 adjustments. 
		//Just remove the declaration and replace it with the commented out one beside it. Near the bottom remove the if statement about the bool array and uncomment the int if statement
		
		String testString = getFromHTML.getTeamScore(inputString, teamChoice, getFromHTML.getScoreFromRow(htmlIn));
		System.out.println("Original:");
		System.out.println(inputString);
		System.out.println();
		System.out.println("Scores will increase by: " + testScore);
		System.out.println();
		System.out.println("Changed:");
		System.out.println(testString);
		
		
	}

}
