import java.util.ArrayList;

import sun.net.www.content.text.Generic;


public class StackGeneric {
	ArrayList<String> mahasiswa = new ArrayList<String>();
	int top = -1;
	
	public void push(String string){
		mahasiswa.add(string);
		top = top+1;
		
	}
	
	public String pop(){
		String value = mahasiswa.get(top);
		mahasiswa.remove(top);
		top = top -1;
		return value;
	}
	
	public void cetak(){
		System.out.println("Data Generic : "+mahasiswa.toString());
	}

	public void push1(String string) {
	
		
	}


}