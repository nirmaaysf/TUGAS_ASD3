import java.util.ArrayList;


public class QueueString {
	ArrayList<String> mahasiswa = new ArrayList<String>();
	int back = -1;
		
		public void insert (String value){
			mahasiswa.add(value);
		}
		public String get(){
			String value = mahasiswa.get(0);
			return value;
		}
		public String pop(){
			String value = mahasiswa.get(back);
			back = back - 1;
			return value;
		}
		
		
		
		public void cetak(){
			System.out.println("Nama Mahasiswa : " + mahasiswa.toString());
		}

	

}