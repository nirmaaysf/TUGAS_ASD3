import java.util.ArrayList;

public class ArrayListFloat {

	public static void main(String[] args) {
	ArrayList <Float> BeratBadan = new 	ArrayList <Float>();
	BeratBadan.add((float) 42.5);
	BeratBadan.add((float) 48.00);
	BeratBadan.add((float) 50.30);
	
	
	System.out.println("Berapa Banyak Data : " + BeratBadan.size());
	System.out.println("Berat Badan : " + BeratBadan);
	BeratBadan.set(0, (float) 46.5);
	BeratBadan.set(2, (float) 47.25);
	System.out.println("Berat Badan : " + BeratBadan);
	}

}
