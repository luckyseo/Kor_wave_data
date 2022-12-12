package contentSurvey;

import java.io.Serializable;

public class SurveyData implements getSurveyData, setSurveyData, Serializable{
	String contentName = null;
	
	SurveyData(){}
	SurveyData(String Name){
		contentName = Name;
	}
	
	double UseWithinAYear = 0;
	String mainContactPath = null;
	String[] favRankingTop=null;
	String[] favRankingBottom=null;
	double aveMonthExpenditure = 0;
	String mainFlatform=null;
	
	@Override
	public void setUseWithinAYear(double data) {
		// TODO Auto-generated method stub
		data = UseWithinAYear;
	}

	@Override
	public void setmainContactPath(String data) {
		// TODO Auto-generated method stub
		data = mainContactPath;
	}

	@Override //new String[] { ... }
	public void setfavRankingTop(String[] data) {
		// TODO Auto-generated method stub
		data = favRankingTop;
	}

	@Override
	public void setfavRankingBottom(String[] data) {
		// TODO Auto-generated method stub
		data = favRankingBottom;
	}

	@Override
	public void setaveMonthExpenditure(double data) {
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
	public double getUseWithinAYear() {
		// TODO Auto-generated method stub
		return UseWithinAYear;
	}

	@Override
	public String getmainContactPath() {
		// TODO Auto-generated method stub
		return mainContactPath;
	}

	@Override
	public String[] getfavRankingTop() {
		// TODO Auto-generated method stub
		return favRankingTop;
	}

	@Override
	public String[] getfavRankingBottom() {
		// TODO Auto-generated method stub
		return favRankingBottom;
	}

	@Override
	public double getaveMonthExpenditure() {
		// TODO Auto-generated method stub
		return aveMonthExpenditure;
	}

	@Override
	public String getmainFlatform() {
		// TODO Auto-generated method stub
		return mainFlatform;
	}

}// end of class
