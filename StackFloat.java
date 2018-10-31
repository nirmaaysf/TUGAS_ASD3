import java.util.ArrayList;


public class StackFloat {

	ArrayList<Float> tinggi_badan = new ArrayList<Float>();
	int top = -1;
	
	public void push(float value){
		tinggi_badan.add(value);
		top = top+1;
		
	}
	
	public float pop(){
		float value = tinggi_badan.get(top);
		tinggi_badan.remove(top);
		top = top -1;
		return value;
	}
	
	public void cetak(){
		System.out.println("data tinggi badan : " +tinggi_badan.toString());
	}
}