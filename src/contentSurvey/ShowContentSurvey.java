package contentSurvey;
import java.util.Scanner;

public class ShowContentSurvey {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		//System.out.println("200"); //ShowContentSurvey메인 페이지 작동 확인용
		
		WhichContent[] conts = WhichContent.values();
		String userInput = null;
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
		userInput = scan.next();

			for(WhichContent cont:conts) {
				if(cont.name().equals( userInput.toUpperCase())) {
					System.out.println("data of "+cont.name());
					//
					//해당 미디어의 데이터를 보여주면 됨
					//
					found = true;
					break;
				}//end of if loop
				else{found = false;}
			}//end of for loop
		if(found == false) {System.out.println("No Data");}
		System.out.print("Do you want to continue search? y/n : ");
		CheckContinue = scan.next(); //try BufferReader
		System.out.println();
		if(CheckContinue.equals("n")| CheckContinue.equals("N")) {ContinueSearch = false;}
		else {continue;}

		}//end of while loop
		scan.close();
	}//end of main
}//end of ShowContentsSurvey
