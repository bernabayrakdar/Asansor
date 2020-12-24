import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;

public class Giris  extends Thread    {

	int musteri_sayisi;
	int gidilecek_kat;
	private volatile boolean Running = true;
	Random random = new Random();
	Queue<Kisiler> kuyruk0 = new LinkedList<Kisiler>();	


	public Giris(Queue<Kisiler> kuyruk02) {
		
		this.kuyruk0 = kuyruk02;
	}
	
	@Override
	public void run() {
	
		while(Running) {			
			
            musteri_sayisi = random.nextInt(10)+1;
			gidilecek_kat = random.nextInt(4)+1;
			kuyruk0.add(new Kisiler(musteri_sayisi,gidilecek_kat));
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}			
		}	
	}
}
