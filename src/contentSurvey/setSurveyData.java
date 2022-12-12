package contentSurvey;

public interface setSurveyData {
	void setUseWithinAYear(double data);//1년 이내 이용률
	void setmainContactPath(String data); //접촉경로
	void setfavRankingTop(String[] data);//호감도 상위 3개국 하위 3개국
	void setfavRankingBottom(String[] data);
	void setaveMonthExpenditure(double data);// 한달 푱균 지출액
	void setmainFlatform(String data);//주 이용 플랙폼

}
