import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> TinggiBadan = new ArrayList<Double>();
	int back = - 1;
	
	public void insert (Double value){
		TinggiBadan.add(value);
	}
	public Double get(){
		Double value = TinggiBadan.get(0);
		return value;
	}
	public Double pop(){
		Double value = TinggiBadan.get(back);
		back = back - 1;
		return value;
	}
	public void cetak(){
		System.out.println("Nama Mahasiswa : " + TinggiBadan.toString());
	}
}
