package com.app;

import java.util.ArrayList;

public class Team {
String teamName;
Integer numOfmatches,won,lost,tie;

ArrayList<Player> playerList = new ArrayList<Player>();

public Team() {}
public Team(String teamName, Integer numOfmatches, Integer won, Integer lost, Integer tie,
		ArrayList<Player> playerList) {
	super();
	this.teamName = teamName;
	this.numOfmatches = numOfmatches;
	this.won = won;
	this.lost = lost;
	this.tie = tie;
	this.playerList = playerList;
}

public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public Integer getNumOfmatches() {
	return numOfmatches;
}
public void setNumOfmatches(Integer numOfmatches) {
	this.numOfmatches = numOfmatches;
}
public Integer getWon() {
	return won;
}
public void setWon(Integer won) {
	this.won = won;
}
public Integer getLost() {
	return lost;
}
public void setLost(Integer lost) {
	this.lost = lost;
}
public Integer getTie() {
	return tie;
}
public void setTie(Integer tie) {
	this.tie = tie;
}
public ArrayList<Player> getPlayerList() {
	return playerList;
}
public void setPlayerList(ArrayList<Player> playerList) {
	this.playerList = playerList;
}
@Override
public String toString() {
	return "Team [teamName=" + teamName + ", numOfmatches=" + numOfmatches + ", won=" + won + ", lost=" + lost
			+ ", tie=" + tie + ", playerList=" + playerList + "]";
}

}
