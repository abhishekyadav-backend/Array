package Pratice;

public class SwiggyOrder {

	public static void main(String[] args) {

		int[] price = { 250, 120, 180, 250, 120, 500 };
		int total = 0;
		int max = price[0];
		int min = price[0];
		int count250 = 0;

		for (int i = 0; i < price.length; i++) {
			total = total + price[i];

			if (price[i] > max) {
				max = price[i];
			}
			if (price[i] < min) {
				min = price[i];
			}
			if (price[i] == 250) {
				count250++;
			}
		}
		double average = (double) total / price.length;
		System.out.println("Total bill =" + total);
		System.out.println("Maxi price =" + max);
		System.out.println("Min price =" + min);
		System.out.println("250Count=" + count250);
		System.out.println("Avag price =" + average);
		System.out.println("Reverse Array :");

		for (int i = 0; i < price.length - 1; i--) {
			System.out.println(price[i]);
		}
		System.out.println("Duplicate price");
		for (int i = 0; i < price.length; i++) {

			for (int j = i + 1; j < price.length; j++) {
				if (price[i] == price[j]) {
					System.out.println(price[i]);
					break;

				}
			}
		}
	}
}
