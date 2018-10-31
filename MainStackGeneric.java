
public class MainStackGeneric {

	public static void main(String[] args) {
		StackGeneric tumpuk = new StackGeneric();
		
		tumpuk.push("Nirma");tumpuk.cetak();
		tumpuk.push("Ramlah");tumpuk.cetak();
		tumpuk.push("Nilasari");tumpuk.cetak();
		tumpuk.push("Aswad");tumpuk.cetak();
		tumpuk.push("Ira");tumpuk.cetak();
		
		tumpuk.pop();tumpuk.cetak();

	}

}