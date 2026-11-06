package Pratice;

public class ElectricityConsumption {

	public static void main(String[] args) {
		int []ElectricityConsumption = {50,14,45,100,78,99,90,10,14,12,};
		int totalUnits = 0;
		
		for(int i=0;i<ElectricityConsumption .length;i++) {
			totalUnits = totalUnits+ElectricityConsumption[i];
		} 
		System.out.println("Total Units ElectricityConsumption  = "+totalUnits);
	}

}
