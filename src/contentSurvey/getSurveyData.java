package contentSurvey;

public interface getSurveyData {
	
	double getUseWithinAYear();//1년 이내 이용률
	String getmainContactPath(); //접촉경로
	String[] getfavRankingTop();//호감도 상위 3개국 하위 3개국
	String[] getfavRankingBottom();
	double getaveMonthExpenditure();// 한달 푱균 지출액
	String getmainFlatform();//주 이용 플랙폼
}
