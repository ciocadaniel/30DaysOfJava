

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.File;



public class HandsOnJava {

	public static void main(String[] args) throws FileNotFoundException {
  
	
		LinkedList<String> names = new LinkedList<>();
	   names.push("Darius");
	   names.push("Adela");
	   names.push("Alex");
	   names.push("Carmen");
	
	  
	   Iterator<String> it = names.iterator();
	/* 
	  System.out.println(it.next());
	  System.out.println(it.next());
	  System.out.println(it.next());
	  System.out.println(it.next());
	 */ 
	   
	   
	//  while(it.hasNext())
		//  System.out.println(it.next());
	  
	   
	   names.add(2,"Adrian");

 

		ListIterator<String> is = names.listIterator();
		
		is.next();
		is.next();
		is.next();
		
		is.add("Karate");
		
	     for(String s : names)
	    	 System.out.println(s); 
	
	   
	
		
		
		
	}
	}



	