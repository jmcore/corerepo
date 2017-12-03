import java.util.List;
public class getQuestion{

	/**
	 * Get Answer from database with sectionID
	 * @param section
	 * @param difficultyInt
	 * @return
	 */
	public static String fromList(int section, int difficultyInt){
		
		scDataBase dB = new scDataBase();
		List<scRecord> records = dB.getRecords();
		
		for(int i=0;i<records.size();i++)
		{
			if((records.get(i).getDifficulty() == difficultyInt) && (records.get(i).getSection() == section))
				return records.get(i).getQuestionHtml();
		}
		return "No Question Found.";
	}
	
	/**
	 * Get Question from database with subject name
	 * @param subject
	 * @param difficultyInt
	 * @return
	 */
	public static String fromList(String subject, int difficultyInt){
		
		scDataBase dB = new scDataBase();
		List<scRecord> records = dB.getRecords();
		
		for(int i=0;i<records.size();i++)
		{
			if((records.get(i).getDifficulty() == difficultyInt) && (records.get(i).getSubject() == subject))
				return records.get(i).getQuestionHtml();
		}
		return "No Question Found.";
	}
	
	/**
	 * Get Question from database with sectionID and subsectionID
	 * @param section
	 * @param subsection
	 * @param difficultyInt
	 * @return
	 */
	public static String fromList(int section, int subsection, int difficultyInt){
		
		scDataBase dB = new scDataBase();
		List<scRecord> records = dB.getRecords();
		
		for(int i=0;i<records.size();i++)
		{
			if(records.get(i).getDifficulty() == difficultyInt)
			{
				if(records.get(i).getSection() == section)
				{
					if(records.get(i).getSubsection() == subsection)
					{
						return records.get(i).getQuestionHtml();
					}
				}
			}
		}
		return "No Question Found.";
	}
}
