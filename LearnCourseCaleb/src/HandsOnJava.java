

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HandsOnJava {

	public static void main(String[] args) throws Exception {
		// Read from File
		
		
		// Method 1 with Scanner
   Scanner in = new Scanner(new File("D:\\JavaSavings\\test.txt"));
   
   List<String> names = new ArrayList<String>();
   
   while(in.hasNextLine())
	   names.add(in.nextLine());
   
   for(String u : names)
	   System.out.println(u);

  in.close();	
  
     // Method 2 with BufferedReader Reader
  
  File file = new File("D:\\JavaSavings\\test.txt");
  
  BufferedReader br = new BufferedReader(new FileReader(file));
  
  String st;
  while((st=br.readLine())!=null)
	  names.add(st);
  
  for(String u : names)
	  System.out.println(u+" nou");
   
	}
	}



	