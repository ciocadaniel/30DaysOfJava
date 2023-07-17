

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HandsOnJava {

	public static void main(String[] args) throws Exception {

		 
   Scanner in = new Scanner(new File("D:\\JavaSavings\\test.txt"));
   
   List<String> names = new ArrayList<String>();
   
   while(in.hasNextLine())
	   names.add(in.nextLine());
   
   for(String u : names)
	   System.out.println(u);

  in.close();	
   
	}
	}



	