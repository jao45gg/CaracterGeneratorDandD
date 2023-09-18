package services;

public class GenerateRandomNum {
	final static int min = 1;
	final static int max = 6;
	public static int generate() {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
