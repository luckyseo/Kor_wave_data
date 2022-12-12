package contentSurvey;

import java.io.Serializable;

public class SurveyData implements getSurveyData, setSurveyData, Serializable{
	public String contentName = null;
	String UseWithinAYear = null;
	String mainContactPath = null;
	String favRankingTop=null;
	String favRankingBottom=null;
	String aveMonthExpenditure = null;
	String mainFlatform=null;
	
	SurveyData(){}
	SurveyData(String Name){
		contentName = Name;
	}
	public SurveyData(String Name, String UWA, String MCP, String FAT, String FAB, String MEX, String MForm){
		contentName = Name;
		UseWithinAYear = UWA;
		mainContactPath = MCP;
		favRankingTop=FAT;
		favRankingBottom=FAB;
		aveMonthExpenditure = MEX;
		mainFlatform=MForm;
	}
	
	
	
	@Override
	public void setUseWithinAYear(String data) {
		// TODO Auto-generated method stub
		data = UseWithinAYear;
	}

	@Override
	public void setmainContactPath(String data) {
		// TODO Auto-generated method stub
		data = mainContactPath;
	}

	@Override
	public void setfavRankingTop(String data) {
		// TODO Auto-generated method stub
		data = favRankingTop;
	}

	@Override
	public void setfavRankingBottom(String data) {
		// TODO Auto-generated method stub
		data = favRankingBottom;
	}

	@Override
	public void setaveMonthExpenditure(String data) {
		// TODO Auto-generated method stub
		data = aveMonthExpenditure;
	}

	@Override
	public void setmainFlatform(String data) {
		// TODO Auto-generated method stub
		data = mainFlatform;
	}
	//-----------------------------------------------------------------//
	@Override
	public String getUseWithinAYear() {
		// TODO Auto-generated method stub
		return UseWithinAYear;
	}

	@Override
	public String getmainContactPath() {
		// TODO Auto-generated method stub
		return mainContactPath;
	}

	@Override
	public String getfavRankingTop() {
		// TODO Auto-generated method stub
		return favRankingTop;
	}

	@Override
	public String getfavRankingBottom() {
		// TODO Auto-generated method stub
		return favRankingBottom;
	}

	@Override
	public String getaveMonthExpenditure() {
		// TODO Auto-generated method stub
		return aveMonthExpenditure;
	}

	@Override
	public String getmainFlatform() {
		// TODO Auto-generated method stub
		return mainFlatform;
	}
	public String toString() {
		return "UseWithInAYear: "+getUseWithinAYear()+"mainContactPath: "+getmainContactPath()+"favRankingTop: "+getfavRankingTop()+"aveMonthExpenditure: "+getaveMonthExpenditure()+"mainFlatform: "+getmainFlatform();
	}

}// end of class
