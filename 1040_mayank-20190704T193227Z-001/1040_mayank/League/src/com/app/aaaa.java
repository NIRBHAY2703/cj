package com.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {
		

	try {	
		Scanner sc =new Scanner(System.in);
		System.out.println("menu\n 1.Create league \n 2.Show league");
		int ch=sc.nextInt();
		League a=new League();
		switch(ch)
		{
		case 1:
				System.out.println("enter league name");
				String name= sc.next();
				System.out.println("enter team type");
				String type=sc.next();
				System.out.println("enter number of players team ");
				int num=sc.nextInt();
				
				a.setLeagueName(name);
				System.out.println("enter no of team to be added");
				int tnum=sc.nextInt();
				ArrayList<Team> tlist=new ArrayList<Team>();
				Team t=new Team();
				for(int i=0;i < tnum ;i++)
				{
					
					System.out.println("enter name of team to be added");
					String tname=sc.next();                                        //createing team
					t.setTeamName(tname);
					System.out.println("enter  team  type to be added");
					String ttype=sc.next();                                        //createing team
					t.setTeamName(tname);
					System.out.println("enter match won");
					int twon=sc.nextInt();
					t.setWon(twon);
					System.out.println("enter match lost");
					int tlost=sc.nextInt();
					t.setLost(tlost);
					System.out.println("enter match tie");
					int ttie=sc.nextInt();
					t.setTie(ttie);
					System.out.println("enter match played");
					int tplayed=sc.nextInt();
					t.setNumOfmatches(tplayed);
					
					if(ttype.equals(type))
					{
						System.out.println("team mismatch");
						throw new Exception(); 
					}
					
					ArrayList<Player> plist=new ArrayList<Player>();
					
					for(int j=0;j<num ;j++)              //geting players 
					{
					System.out.println("enter player name");
					String pname=sc.next();
					System.out.println("enter player type");
					
					String ptype=sc.next();
					Player p =new Player(pname,ptype);
					plist.add(p);
					}
					t.setPlayerList(plist); //adding player to team
					
		}//for taking team
				
				a.setTeamList(tlist);//adding team list to league 
			
		case 2:
			System.out.println("displaying league");
			List teamList=a.getTeamList();
			for(int a1=1;a1<teamList.size();a1++)
			{
			System.out.println(teamList.iterator());
			}
			
		
			
		
			
			
			}
		
	}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	
		
	}

}
