import java.util.ArrayList;
public class Kontrol extends Thread {
	
	 int toplam_musteri;
	 boolean gelen_durum;
	
	 ArrayList<Boolean> Kontroller_Durum = new ArrayList<Boolean>();
	 Asansor asansorr,asansorr1,asansorr2,asansorr3,asansorr4;

	 public Kontrol(int toplam_kisi, int toplam_kisi2, boolean durum, Asansor asansor, Asansor asansor1, Asansor asansor2, Asansor asansor3, Asansor asansor4) {
		 
		this.toplam_musteri = toplam_kisi;		
		this.gelen_durum = durum;	
		
		this.asansorr =  asansor;
		this.asansorr1 = asansor1;
		this.asansorr2=  asansor2;
		this.asansorr3 = asansor3;
		this.asansorr4 = asansor4;
	}
	 
		@Override
		public void run() {	
	
			while(true)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {   					
					e.printStackTrace();
				}
			Asansor_Kontrol();
			Calisma();		
			}			
	}

public  void Asansor_Kontrol()
{		
	for(int i=0; i<asansorr.Toplam_Kontrol.size(); i++)
	{	
		if(asansorr.Toplam_Kontrol.get(i) >= 20)
		{
			asansorr.durum = true;
			Kontroller_Durum.add(asansorr.durum);		
		}
		else if(asansorr.Toplam_Kontrol.get(i) < 20)
		{
			asansorr.durum = false;
			Kontroller_Durum.add(asansorr.durum);
		}
	}

	asansorr1.Kuyruk0 = asansorr.Kuyruk0;

	if(asansorr.durum == true)
	{
		for(int i=0; i<Kontroller_Durum.size(); i++)
		{
			if(asansorr1.isAlive() == false)
			{
				asansorr1.start();		
				asansorr2.Kuyruk0 = asansorr.Kuyruk0;	
				break;
			}
			else if(asansorr1.isAlive() == true && asansorr2.isAlive() == false )
			{		
				asansorr2.start();				
				asansorr3.Kuyruk0 = asansorr.Kuyruk0;
				break;
			}
			else if(asansorr2.isAlive() == true && asansorr3.isAlive() == false )			
			{
			
				asansorr3.start();		
				asansorr4.Kuyruk0 = asansorr.Kuyruk0;			
				break;
			}
			else if(asansorr3.isAlive() == true && asansorr4.isAlive() == false)
			{
				asansorr4.start();
				break;
			}		
		}	
		Kontroller_Durum.clear();
		asansorr.Toplam_Kontrol.clear();		
	}	
}

public void Calisma()
{
	if(Asansor.sync == 1)
	{
		if(asansorr.isAlive() == true)
		{
			Asansor.id_tut.add(0);
		}
		
		if(asansorr1.isAlive() == true)
		{
			Asansor.id_tut.add(1);
		}
		
		if(asansorr2.isAlive() == true)
		{
			Asansor.id_tut.add(2);
		}
		if(asansorr3.isAlive() == true)
		{
			Asansor.id_tut.add(3);
		}
		if(asansorr4.isAlive() == true)
		{
			Asansor.id_tut.add(4);
		}
		Asansor.sync = 0;		
	}			
}
}