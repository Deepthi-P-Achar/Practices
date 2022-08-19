package com.example.games;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
	Board board;
	Dice dice;
	Queue <Player>players=new LinkedList<Player>();
	GameStatus gameStatus;
	public Game(Board board, Dice dice) {
		super();
		this.board = board;
		this.dice = dice;
		 this.players = new LinkedList<Player>();
	      this.gameStatus = GameStatus.NOT_STARTED;
	}
	public void startGame() {
		while(players.size()>1) {
			Player player=players.poll();
			makeMove(player);
			if(player.getPosition()==board.getTotalCells()) {
				System.out.println(player.getPlayerName() +"has won");
			}else {
				if(player.getPosition()<board.getTotalCells()) {
					players.offer(player);
				}
			}
		}
		 this.gameStatus = GameStatus.GAMEOVER;
	}
	private void makeMove(Player player) {
		int diceValue=dice.roll();
		int currentPosition=player.getPosition();
		int targetPosition=currentPosition+diceValue;
		if(targetPosition>board.getTotalCells()) {
			System.out.println("invalid move");
		}else {
			if(this.board.hasSpecialEntity(targetPosition)) {
				targetPosition=this.board.getSpecialEntity(targetPosition).getEndPoint();
				
			}
			player.setPosition(targetPosition);
			
		}
		
		
	}
	public void addPlayers(List<Player> all_players) throws Exception
    {
        if(this.gameStatus == GameStatus.NOT_STARTED)
        {
            for(Player player : all_players)
                this.players.add(player);
        }
        else
            throw new Exception("Can't add players after game started");
 
    } 

}
