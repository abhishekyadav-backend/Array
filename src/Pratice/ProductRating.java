package Pratice;

public class ProductRating {

	public static void main(String[] args) {
		int []rating = {4,2,3,5,6};
		int total =0;
		for (int i=0;i<rating.length;i++) {
			if (rating[i]>=4) {
				total++;
			}
		}
		System.out.println("total heigh rating :"+total);
	}

}
