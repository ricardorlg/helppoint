package com.endava.help.dp.singleton;

public class Singleton {

	private int id;
	private static Singleton instance = null;

	private Singleton() {
		id++;
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
