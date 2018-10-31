
public class MainStackFloat {

	public static void main(String[] args) {
		
		StackFloat Berat = new StackFloat();
		Berat.cetak();
	
		Berat.push ((float) 40.47);Berat.cetak();
		Berat.push ((float) 45.40);Berat.cetak();
		Berat.push ((float) 50.47);Berat.cetak();
		Berat.push ((float) 48.47);Berat.cetak();
		

		Float br = Berat.pop(); Berat.cetak();
		System.out.println(br);
		
		
	}

}