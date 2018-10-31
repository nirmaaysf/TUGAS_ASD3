import java.util.ArrayList;

public class ArrayListInteger {

			public static void main(String[] args) {
				ArrayList<Integer> Nilai_Mahasiswa = new ArrayList<Integer>();
				Nilai_Mahasiswa.add(95);
				Nilai_Mahasiswa.add(80);
				Nilai_Mahasiswa.add(85);
				Nilai_Mahasiswa.add(70);
				Nilai_Mahasiswa.add(60);
				
				System.out.println(Nilai_Mahasiswa.isEmpty());
				System.out.println("Nilai Mahasiswa" + Nilai_Mahasiswa);
				System.out.println("Ada berapa yang mempunyai nilai 80 : " + Nilai_Mahasiswa.indexOf(80));
				
				ArrayList<Integer> Nilai_Mahasiswa1 = Nilai_Mahasiswa;
				System.out.println("1" + Nilai_Mahasiswa);
				System.out.println("2" + Nilai_Mahasiswa1);
				Nilai_Mahasiswa1.remove(3);
				System.out.println("1" + Nilai_Mahasiswa);
				System.out.println("2" + Nilai_Mahasiswa1);
			}

	
	}

