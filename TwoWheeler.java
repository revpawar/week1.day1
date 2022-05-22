package week1.day1;

public class TwoWheeler {
	
	int noOfWheels;
	short noOfMirrors;
	long chassisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM;

	public static void main(String[] args) {

		TwoWheeler obj = new TwoWheeler();
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chassisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.out.println(obj.runningKM);
	}
}
