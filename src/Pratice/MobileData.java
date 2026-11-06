package Pratice;

public class MobileData {
	public static void main(String[] args) {
         int []data = {2,3,5,8,9,10,12};
         int max = data[0];
         for(int i=0;i<data.length;i++) {
        	  if(data[i]>max) {
        		  max =data[i];
        	  }
         }
         System.out.println("max data Used = "+max);
	}
}
