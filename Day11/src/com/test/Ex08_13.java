package com.test;

public class Ex08_13 {
	public enum Colors {
		RED, BLACK, YELLOW, BLUE
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colors color = Colors.BLACK;
		System.out.println(color);

		Colors[] c = Colors.values();
		for (Colors x : c) {
			System.out.println(x.name() + "\t" + x.ordinal());
		}
		switch (color) {
		case RED:
			System.out.println("RED");
			break;
		case BLACK:
			System.out.println("BLACK");
			break;
		case YELLOW:
			System.out.println("YELLOW");
			break;
		case BLUE:
			System.out.println("BLUE");
			break;
		default:
			break;
		}
	}

}
