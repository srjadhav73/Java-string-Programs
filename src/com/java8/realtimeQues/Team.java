package com.java8.realtimeQues;

import java.util.List;

public class Team {
	
	private List<Player> playerList;
	
	public int getScore()
	{
		if(playerList!=null)
		{
			return playerList.stream().mapToInt(player -> player.getScore()).reduce(0,(p1,p2) -> p1+p2);
		}
		return 0;
		
	}
	

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	

}
