package Pratice;

public class Average {

	public static void main(String[] args) {
		int[] salary = { 5000, 3000, 10000, 80000, 90000 };

		int total = 0;
		for (int i = 0; i < salary.length; i++) {
			total = total + salary[i];
		}
		double average = (double) total / salary.length;
		System.out.println("Total salary = " + total);
		System.out.println("Avarage salary =" + average);
	}

}
