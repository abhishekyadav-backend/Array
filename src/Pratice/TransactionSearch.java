package Pratice;

import java.util.Scanner;

public class TransactionSearch {
  public static void main(String[]args)
  {
	   int[]transcation = {500,1000,500,2000,500,3000};
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter Ammount");
	   int search = sc.nextInt();
	   sc.nextLine();
	   int count = 0;
	   for(int i= 0;i<transcation.length;i++) {
		   if(transcation[i]==search) {
			   System.out.println("Found at index ="+i);
			   count++;
		   }
	   }
	   System.out.println("Total Occurrence ="+count);
  }
}
