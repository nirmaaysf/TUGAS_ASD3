import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
	ArrayList<Double> TinggiBadan = new ArrayList<Double>();
	TinggiBadan.add(120.10);
	TinggiBadan.add(120.20);
	TinggiBadan.add(115.11);
	TinggiBadan.add(121.00);
	TinggiBadan.add(123.10);
	System.out.println("Apakah ArrayList Kosong : " + TinggiBadan.isEmpty());
	System.out.println("Tinggi Badan : " + TinggiBadan);
	System.out.println("Berapa Jumlah Data : " + TinggiBadan.size());
	TinggiBadan.remove(2);
	System.out.println("Tinggi Badan : " + TinggiBadan);
	}

}
