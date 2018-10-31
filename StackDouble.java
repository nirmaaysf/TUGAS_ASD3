import java.util.ArrayList;


public class StackDouble {

	ArrayList<Double> berat_badan = new ArrayList<Double>();
	int top = -1;
	
	public void push(Double value){
		berat_badan.add(value);
		top = top+1;
		
	}
	
	public Double pop(){
		Double value = berat_badan.get(top);
		berat_badan.remove(top);
		top = top -1;
		return 0.;
	}
	
	public void cetak(){
		System.out.println("data berat badan : " + berat_badan.toString());
	}

}