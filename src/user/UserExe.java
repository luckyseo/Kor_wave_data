package user;

import contentSurvey.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class UserExe {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		//String userInput;
		int userInputInt;
		boolean menuContinue = true;
		System.out.println("Start Program");
		List<SurveyData> KWSurvey = new Vector<>();
		//WhichContent[] contents = WhichContent.values();
		String[] surlist = {"UseWithinAYear", "mainContactPath","favRankingTop","favRankingBottom","aveMonthExpenditure","mainFlatform"};
		
		String path="C:\\Users\\user\\Desktop\\javaLec\\kor_wave_data\\src\\KW2022sur.txt";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(menuContinue){
			System.out.println("Handle Kor-Wave Data");
			System.out.println("1.Search \n2.Add Data \n3.recreate txt File \n4.Exit");
			
			userInputInt = scanner.nextInt();
			//userInputInt = Integer.parseInt(userInput);
			if(userInputInt == 1) {
				WhichContent[] conts = WhichContent.values(); //열거 타입 사용
				String userInput_ = null;
				String CheckContinue = null;
				boolean ContinueSearch = true;
				boolean found = false;
				
				while(ContinueSearch) {
					System.out.print("[");
					for(WhichContent cont:conts) {
						System.out.print(cont.name()+" ");
					}//end of for loop
					System.out.print("]");
					System.out.println();
				System.out.print("Which content's result do you want: ?");
				userInput_ = bf.readLine();

					for(WhichContent cont:conts) {
						if(cont.name().equals( userInput_.toUpperCase())) {
							System.out.println("data of "+cont.name());
							FileInputStream fis = new FileInputStream(path);
							ObjectInputStream ois = new ObjectInputStream(fis);
							try{List<SurveyData> list = (List<SurveyData>)ois.readObject();
							System.out.println(userInput_.toUpperCase()+"에 대한 데이터");
							for(SurveyData sd : list) {
								if(userInput_.equals(sd.contentName)) {
								System.out.println(sd.getaveMonthExpenditure() + ","+sd.getfavRankingBottom()+", "+sd.getfavRankingTop()+", "+sd.getmainContactPath()+", "+sd.getmainFlatform()+", "+sd.getUseWithinAYear());
								}
							}
							}catch(EOFException eof) {
								System.out.println("null");
								System.out.println("you need to add data first");
							}
								
							
							found = true;
							break;
						}//end of if loop
						else{found = false;}
					}//end of for loop
				if(found == false) {System.out.println("No Data");}
				System.out.print("Do you want to continue search? y/n : ");
				CheckContinue = bf.readLine(); //try BufferReader
				System.out.println();
				if(CheckContinue.equals("n")| CheckContinue.equals("N")) {
					ContinueSearch = false;
					}
				else {
					ContinueSearch = true;
					}

				}//end of while loop
				menuContinue = true;
			}else if(userInputInt == 2) {
				//add data하는 기능 실행됨
				System.out.println("What kind of data of content you want to add?");
				String userInput = bf.readLine();
				System.out.println("다음 순서대로 값을 입력하시오.");
				for(int i =0; i<surlist.length;i++) {
					System.out.print(surlist[i]+", ");
				}
				System.out.println();
				String str = bf.readLine();
				String arr[] = str.split(" "); // 란 줄에 입력 받아서 저장 - 텍스트 파일에 저장 될 것임
				KWSurvey.add(new SurveyData(userInput, arr[0], arr[1], arr[2], arr[3],arr[4],arr[5]));
				//data는 객체단위로 저장되고 출력됨
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
						if(userInput.equals(sd.contentName)) {
						System.out.println(sd.getaveMonthExpenditure() + ","+sd.getfavRankingBottom()+", "+sd.getfavRankingTop()+", "+sd.getmainContactPath()+", "+sd.getmainFlatform()+", "+sd.getUseWithinAYear());
						}
					}
					
				}
				menuContinue = true;
			}else if(userInputInt == 3) { //파일이 있으면 먼저 delete하고 다시 만드는 것임
				File f  = new File("C:\\Users\\user\\Desktop\\javaLec\\kor_wave_data\\src\\KW2022sur.txt");
				if(f.exists()) {
					f.delete();
					System.out.println("deleted");
				}
				System.out.println("file doesn't exist. so created new file");
				f.createNewFile();
				menuContinue = true;
			}else if(userInputInt == 4){ //시스템 종료
				menuContinue = false;
			}else {
				System.out.println("Wrong input");
			}//end of if loop
			
		}//end of while
		scanner.close();
		System.out.println("Program is closed.");
	}//end of main
}//end of UserExe
