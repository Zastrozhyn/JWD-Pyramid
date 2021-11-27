package by.zastr.shape.util;

public class IdGenerator {
	private static long currentId=0;
	private IdGenerator() {}
	public static long generateId() {
		currentId++;
		return currentId;
	}

}
