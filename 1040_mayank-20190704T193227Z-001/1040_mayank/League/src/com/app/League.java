package com.app;

import java.util.ArrayList;

public class League {
	String leagueName;
	ArrayList<Team> teamList = new ArrayList<Team>();
	
	public League(String leagueName, ArrayList<Team> teamList) {
		super();
		this.leagueName = leagueName;
		this.teamList = teamList;
	}
	
	public League()
	{}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public ArrayList<Team> getTeamList() {
		return teamList;
	}

	public void setTeamList(ArrayList<Team> teamList) {
		this.teamList = teamList;
	}

	@Override
	public String toString() {
		return "League [leagueName=" + leagueName + ", teamList=" + teamList + "]";
	}
	
	

}
