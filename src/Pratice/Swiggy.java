package Pratice;

public class Swiggy {
	
public static void main(String[]args) {
	int[]price= {500,600,200,300,100,1000};
	int total =0;
	
	for(int i =0;i<price.length;i++) {
		 total =total +price[i];
	}
	System.out.println("Total Bill:"+total);
}
}
