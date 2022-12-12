package user;

import java.util.Scanner;

import contentSurvey.*;
import handleFile.*;


public class UserExe {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		//String userInput;
		int userInputInt;
		boolean menuContinue = true;
		System.out.println("Start Program");
		
		while(menuContinue){
			System.out.println("Handle Kor-Wave Data");
			System.out.println("1.Search \n2.Add Data \n3.Check in txt File \n4.Exit");
			
			userInputInt = scanner.nextInt();
			//userInputInt = Integer.parseInt(userInput);
			if(userInputInt == 1) {
				ShowContentSurvey.main(null);
				menuContinue = true;
			}else if(userInputInt == 2) {
				ActualDataEntry.main(null);
				menuContinue = true;
			}else if(userInputInt == 3) {
				Storage.main(null);
				menuContinue = true;
			}else if(userInputInt == 4){
				menuContinue = false;
			}else {
				System.out.println("Wrong input");
			}//end of if loop
			
		}//end of while
		scanner.close();
		System.out.println("Program is closed.");
	}//end of main
}//end of UserExe
