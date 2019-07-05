package com.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		ArrayList<Integer> mylist= new ArrayList<Integer>();
		System.out.println("enter size");
		Scanner sc= new Scanner(System.in);
		int cnt=sc.nextInt();
		for( int i=0;i<cnt;i++)
		{
			int a=sc.nextInt();
			mylist.add(a);
		}
	
		//displaying
		int count=0;
		for (Integer integer : mylist) 
		{
			Integer val=integer;
			System.out.println(val);
			System.out.println("\t");
		
		for(Integer sec :mylist)
			{
				if(sec.equals(val))
				{count++;}
			}
			System.out.print(count);
			count=0;
			
		}
		
	}
	
}
