package com.example.games;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {
	int dimention;
	HashMap <Integer,SpecialEntity>specialEntities=new HashMap<Integer,SpecialEntity>();
	
	public Board(int dimention) {
		this.dimention=dimention;
	}
	public int getTotalCells() {
		return this.dimention*this.dimention;
	}
	public void addSpecialEntity(SpecialEntity entity) {
		specialEntities.put(entity.getActionPoint(),entity);
		
	}
	public boolean hasSpecialEntity(int start) {
		if(specialEntities.containsKey(start)) {
			return true;
		}else {
			return false;
		}
	}
	public SpecialEntity getSpecialEntity(int start) {
		return specialEntities.get(start);
	}
	

}
