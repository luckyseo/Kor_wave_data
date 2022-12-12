package contentSurvey;

import java.util.*;
import java.io.*;

public class ActualDataEntry {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception{
		List<SurveyData> KWSurvey = new Vector<>();
		WhichContent[] contents = WhichContent.values();
		String[] surlist = {"UseWithinAYear", "mainContactPath","favRankingTop","favRankingBottom","aveMonthExpenditure","mainFlatform"};
		/*
		 for (WhichContent con : contents) {
			Survey2022.add(new SurveyData(con.name()));
		} //end of for
		*/
		//File fi = new File("C:\\Users\\user\\Desktop\\javaLec\\kor_wave_data\\src\\KW2022sur.txt");
		String path="C:\\Users\\user\\Desktop\\javaLec\\kor_wave_data\\src\\KW2022sur.txt";
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What kind of data of content you want to add?");
		String userInput = bf.readLine();
		System.out.println("다음 순서대로 값을 입력하시오.");
		for(int i =0; i<surlist.length;i++) {
			System.out.print(surlist[i]+", ");
		}
		System.out.println();
		String str = bf.readLine();
		String arr[] = str.split(" ");
		KWSurvey.add(new SurveyData(userInput, arr[0], arr[1], arr[2], arr[3],arr[4],arr[5]));
		
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(KWSurvey);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream(path);
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			List<SurveyData> list = (List<SurveyData>)ois.readObject();
			System.out.println(userInput.toUpperCase()+"에 대한 데이터");
			for(SurveyData sd : list) {
				System.out.println(sd.getaveMonthExpenditure() + ","+sd.getfavRankingBottom()+", "+sd.getfavRankingTop()+", "+sd.getmainContactPath()+", "+sd.getmainFlatform()+", "+sd.getUseWithinAYear());
			}
		}
	}//end of main
	
}// end of ActualDataEntry
