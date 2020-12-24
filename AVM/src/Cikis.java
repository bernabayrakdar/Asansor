import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Cikis extends Thread {
	
	    private volatile boolean Running = true;
		Random random = new Random();

		static int bulundugu_kat,toplam_kisi;
		int cikis_musteri_sayisi;
		ArrayList<Integer> Kat_Tut = new ArrayList<Integer>();
		ArrayList<Integer> Toplam_Tut = new ArrayList<Integer>();
		
		 Queue<Kisiler> cikis_kuyruk1 = new LinkedList<Kisiler>();
		 Queue<Kisiler> cikis_kuyruk2 = new LinkedList<Kisiler>();
		 Queue<Kisiler> cikis_kuyruk3 = new LinkedList<Kisiler>();
		 Queue<Kisiler> cikis_kuyruk4 = new LinkedList<Kisiler>();		
		 
		 public Cikis(Queue<Kisiler> kuyruk1, Queue<Kisiler> kuyruk2, Queue<Kisiler> kuyruk3, Queue<Kisiler> kuyruk4,int toplam_kisi,int bulundugu_kat){
			 
			 this.cikis_kuyruk1 = kuyruk1;
			 this.cikis_kuyruk2 = kuyruk2;
			 this.cikis_kuyruk3 = kuyruk3;
			 this.cikis_kuyruk4 = kuyruk4;
			 this.toplam_kisi = toplam_kisi;
			 this.bulundugu_kat = bulundugu_kat;			
		}
		
		@Override
		public void run() {
		
			while(Running) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {   					
					e.printStackTrace();   					
				}
			Cikis_Duzenle(cikis_kuyruk1, cikis_kuyruk2, cikis_kuyruk3, cikis_kuyruk4, toplam_kisi, bulundugu_kat);		
		 }	
	}
	
public Queue<Kisiler> Cikis_Duzenle(Queue<Kisiler> cikis_kuyruk1, Queue<Kisiler> cikis_kuyruk2, Queue<Kisiler> cikis_kuyruk3, Queue<Kisiler> cikis_kuyruk4,int toplam_kisi,int bulundugu_kat)	
{
		if(bulundugu_kat == 1) 
		{					
			if(toplam_kisi < 5  && toplam_kisi> 0)
			{				
				cikis_musteri_sayisi = random.nextInt(toplam_kisi)+1;
				cikis_kuyruk1.add(new Kisiler(cikis_musteri_sayisi,0));
				toplam_kisi -= cikis_musteri_sayisi;
			}
			else if (toplam_kisi >= 5)
			{
				cikis_musteri_sayisi = random.nextInt(5)+1;
				cikis_kuyruk1.add(new Kisiler(cikis_musteri_sayisi,0));
				toplam_kisi -= cikis_musteri_sayisi;
			}
			Kat_Tut.add(bulundugu_kat);
			Toplam_Tut.add(toplam_kisi);
			return cikis_kuyruk1;
		}		
		if(bulundugu_kat == 2)
		{					
			if(toplam_kisi < 5  && toplam_kisi > 0)
			{
				cikis_musteri_sayisi = random.nextInt(toplam_kisi)+1;
				cikis_kuyruk2.add(new Kisiler(cikis_musteri_sayisi,0));
				toplam_kisi -= cikis_musteri_sayisi;
			}
			else if (toplam_kisi >= 5)
			{
				cikis_musteri_sayisi = random.nextInt(5)+1;
				cikis_kuyruk2.add(new Kisiler(cikis_musteri_sayisi,0));
				toplam_kisi -= cikis_musteri_sayisi;
			}
			Kat_Tut.add(bulundugu_kat);
			Toplam_Tut.add(toplam_kisi);
			return cikis_kuyruk2;
		}
		if(bulundugu_kat == 3)
		{			
			if(toplam_kisi < 5 && toplam_kisi > 0 )
			{
				cikis_musteri_sayisi = random.nextInt(toplam_kisi)+1;
				cikis_kuyruk3.add(new Kisiler(cikis_musteri_sayisi,0));   				
				toplam_kisi -= cikis_musteri_sayisi;
			}
			else if (toplam_kisi >= 5)
			{
				cikis_musteri_sayisi = random.nextInt(5)+1;
				cikis_kuyruk3.add(new Kisiler(cikis_musteri_sayisi,0));
				toplam_kisi -= cikis_musteri_sayisi;
			}
			Kat_Tut.add(bulundugu_kat);
			Toplam_Tut.add(toplam_kisi);
			return cikis_kuyruk3;
		}
		if(bulundugu_kat == 4)
		{
			if(toplam_kisi < 5  && toplam_kisi > 0)
			{
				cikis_musteri_sayisi = random.nextInt(toplam_kisi)+1;
				cikis_kuyruk4.add(new Kisiler(cikis_musteri_sayisi,0));
				toplam_kisi -= cikis_musteri_sayisi;
			}
			else if (toplam_kisi >= 5)
			{
				cikis_musteri_sayisi = random.nextInt(5)+1;
				cikis_kuyruk4.add(new Kisiler(cikis_musteri_sayisi,0));
				toplam_kisi -= cikis_musteri_sayisi;
			}
			Kat_Tut.add(bulundugu_kat);
			Toplam_Tut.add(toplam_kisi);
		return cikis_kuyruk4;
		}					
	return null;
}
}