package Pratice;

public class ShopingCart {

	public static void main(String[] args) {
		
		int []price= {100,250,150,500,200};
		int total =0;
		for (int i = 0;i<price.length;i++) {
			total= total+price[i];
		}
        System.out.println("Total Bill :"+total);
	}

}
