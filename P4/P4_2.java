
package practice4_2;
interface Instrument {  
	// volume은 여기에만 있어야 함
	// 생성자와 메소드 추가
	abstract void print();  
	abstract void volumeUp(); 
	abstract void volumeDown(); 
}
class Volume {
	int volume;
}
class Piano extends Volume implements Instrument { 
	// 생성자와 메소드 추가
	Piano(int vol){
		volume=vol;	
	}
	public void print() {
		System.out.println("Piano volume : "+volume);
	}
	public void volumeUp() {volume+=1;}
	public void volumeDown() {volume-=1;}
}

class Flute extends Volume implements Instrument {
	// 생성자와 메소드 추가
	Flute(int vol){
		volume=vol;
		}
	public void print() {
		System.out.println("Flute volume : "+volume);
	}
	public void volumeUp() {volume+=2;}
	public void volumeDown() {volume-=2;}
}


public class P4_20161253_2 {
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
