package com.example.games;

public abstract class SpecialEntity {
private int start;
private int end;
public SpecialEntity(int start, int end) {
	this.start = start;
	this.end = end;
}
public int getEndPoint() {
	return this.end;
}
public int getActionPoint() {
	return this.start;
}
}
