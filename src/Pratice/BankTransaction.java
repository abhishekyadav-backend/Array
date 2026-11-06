package Pratice;

public class BankTransaction {

	public static void main(String[] args) {
		int []transaction = {5000,1000,10,5800000};
		int total = 0;
		for (int i=0;i<transaction.length;i++) {
			total = total+transaction[i];
		}
		System.out.println("Total transaction ="+total);
	}

}
