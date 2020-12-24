import java.util.LinkedList;
import java.util.Queue;

public class Main {	
	
	static Queue<Kisiler> kuyruk0 = new LinkedList<Kisiler>();
	static Queue<Kisiler> kuyruk1= new LinkedList<Kisiler>();
	static Queue<Kisiler> kuyruk2= new LinkedList<Kisiler>();
	static Queue<Kisiler> kuyruk3= new LinkedList<Kisiler>();
	static Queue<Kisiler> kuyruk4= new LinkedList<Kisiler>();
	static int toplam_kisi, bulundugu_kat,i=0;

	 public static void main(String[] args) {	
	    	
		 Asansor asansor = new Asansor(kuyruk0,false,0,"idle","up",10);
		 Asansor asansor1 = new Asansor(kuyruk0,false,0,"idle","up",10);
		 Asansor asansor2 = new Asansor(kuyruk0,false,0,"idle","up",10);
		 Asansor asansor3 = new Asansor(kuyruk0,false,0,"idle","up",10);
		 Asansor asansor4 = new Asansor(kuyruk0,false,0,"idle","up",10);
		 Asansor frame = new Asansor();
		 
		 Cikis cikis = new Cikis(kuyruk1,kuyruk2,kuyruk3,kuyruk4,toplam_kisi,bulundugu_kat);
		 Giris giris = new Giris(kuyruk0);	
		 Kontrol kontrol = new Kontrol(0,toplam_kisi,false,asansor,asansor1,asansor2,asansor3,asansor4);

		 giris.start();		
		 asansor.start();		
		 cikis.start();
		 kontrol.start();
	}	 
}