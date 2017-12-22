package com.endava.help.dp;

public enum DogBreedSizes {

	SMALL("small"), MEDIUM("medium"), LARGE("large");
	private final String text;

	/**
	 * @param text
	 */
	private DogBreedSizes(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
