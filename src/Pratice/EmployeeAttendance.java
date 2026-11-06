package Pratice;

public class EmployeeAttendance {
	public static void main(String[] args) {
		int[] present = { 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 };
		int total = 0;
		for (int i = 0; i < present.length; i++) {
           total= total+present[i]; 
		}
		System.out.println("Total 30 present count ="+total);
	}
}
