import java.util.ArrayList;


public class QueueFloat {
	ArrayList<Float> tinggi_badan = new ArrayList<Float>();
	int back = -1;
	
	public void insert(float value){
		tinggi_badan.add(value);
	}
	
	public float get(){
		float value = tinggi_badan.get(0);
		tinggi_badan.remove(0);
		return value;
	}
	
	public void cetak(){
		System.out.println("Daftar tinggi badan mahasiswa"+tinggi_badan);
	}

}