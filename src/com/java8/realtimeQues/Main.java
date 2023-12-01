package com.java8.realtimeQues;

import java.util.ArrayList;
import java.util.List;

/*
 *  Q1.Find the sum of score of all the players in team
 * 
 * given 
 * 
 * 1. class Team {
 *     List<Player>;
 * }
 * 
 * 2.class Player
 * {
 *   String name;
 *   String score;
 *   String type;
 * }
 * 
 * 
 * */
public class Main {
	
	public static void main (String args[])
	{
		Player p1=new Player("Shubham",45,"All-rounder");
		Player p2=new Player("Mitesh",50,"All-rounder");
		Player p3=new Player("Ashvin",30,"Bowler");
		
		List<Player> list=new ArrayList<Player>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Team ict= new Team();
		ict.setPlayerList(list);
		
		int totalScore=ict.getScore();
		System.out.println("Total Score of team is "+totalScore);
	}

	

}
