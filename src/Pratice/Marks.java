package Pratice;

public class Marks {

	public static void main(String[] args) {
		int []marks = {90,50,20,90,70,65,56,99};
		int highest = marks[0];
		int lowest = marks[0];
		for (int i = 0;i<marks.length;i++) {
            if(marks[i]>highest) {
            	highest =marks[i];
            }
            if(marks[i]<lowest) {
            	lowest=marks[i];
            }
		}
		System.out.println("Highest ="+highest);
		System.out.println("Lowest = "+lowest);
	}

}
