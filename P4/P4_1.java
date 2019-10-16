
package practice4_1;
abstract class Instrument {  
	private int volume;  // volume은 여기에만 있어야 함
	// 생성자와 메소드 추가
	Instrument(int vol){this.volume=vol;}
	int getVol() {return volume;}
	void setVol(int x) {volume+=x;}
	abstract void print();  
	abstract void volumeUp(); 
	abstract void volumeDown(); 
}
class Piano extends Instrument { 
	// 생성자와 메소드 추가
	Piano(int vol){
		super(vol);	
	}
	void print() {
		System.out.println("Piano volume : "+getVol());
	}
	void volumeUp() {setVol(1);}
	void volumeDown() {setVol(-1);}
}

class Flute extends Instrument {
	// 생성자와 메소드 추가
	Flute(int vol){
		super(vol);
		}
	void print() {
		System.out.println("Flute volume : "+getVol());
	}
	void volumeUp() {setVol(2);}
	void volumeDown() {setVol(-2);}
}


public class P4_20161253_1 {
	public static void main(String[] args) {
		Piano p1 = new Piano(10); 
		Piano p2 = new Piano(20);   
		Flute f = new Flute(100); 
		p1.volumeUp();  
		p2.volumeUp();  
		f.volumeUp();  
		p1.volumeUp();  
		f.volumeUp();   
		f.volumeUp();  
		p2.volumeDown();  
		p1.print();  
		p2.print();    
		f.print(); 
	} 
}
