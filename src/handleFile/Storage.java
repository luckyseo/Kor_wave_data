package handleFile;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

public class Storage {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
	FileInputStream fileStream = new FileInputStream("C:\\Users\\user\\Desktop\\javaLec\\kor_wave_data\\src\\2022sur1.txt");
	
	ObjectInputStream objectInputStream = new ObjectInputStream(fileStream);
	
	HashMap userInfoMap = new HashMap();
	
	
	}//end of main
}//end of Storage
