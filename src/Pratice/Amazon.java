package Pratice;

public class Amazon {
 public static void main(String[]args) {
	 
	 int[]price = {200,1000,800,750,300,100};
	 int max =price[0];
	 int min =price[0] ;
	 for(int i = 0;i<price.length;i++) {
		if(price[i]>max) {
			max  =price[i];
		}
		if(price[i]<min) {
			min = price[i];
		}
	 }
	 System.out.println("Maximum price ="+max);
	 System.out.println("Minimum price ="+min);
 }
}
