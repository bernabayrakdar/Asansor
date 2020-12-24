import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
public class Asansor extends Thread {

	
	 ArrayList<Kisiler> asansor_ici = new ArrayList<Kisiler>(); 
	 ArrayList<Integer> hedef_kat = new ArrayList<Integer>();
	 ArrayList<Integer> Toplam_Kontrol = new ArrayList<Integer>();
	 ArrayList<Integer> Kuyruk_Yazdir = new ArrayList<Integer>();
	 ArrayList<Integer> Kat1_Yazdir = new ArrayList<Integer>();
	 ArrayList<Integer> Kat2_Yazdir  = new ArrayList<Integer>();
	 ArrayList<Integer> Kat3_Yazdir  = new ArrayList<Integer>();
	 ArrayList<Integer> Kat4_Yazdir  = new ArrayList<Integer>();
	 ArrayList<Integer> Kat0_Yazdir  = new ArrayList<Integer>();
	 static int sync = 0;
	 
	 int sayac=0,kontrol_size=0,x,i=0,sayac_tut=0;
	 static int toplam1=0, toplam2=0, toplam3=0, toplam4=0, toplam0=0,kontrol_toplam1=0, kontrol_toplam2=0, kontrol_toplam3=0, kontrol_toplam4=0;
	 static int kuyruk_toplami, asansor_id,k=0;
	
	 volatile boolean Running = true;
	 static ArrayList<Integer> id_tut = new ArrayList<Integer>();
	 static boolean durum = false;
	 static String mode;
	 static String direction;
	 static int capacity;
	 static boolean active = false;
	 static Queue<Kisiler> Kuyruk0 = new LinkedList<Kisiler>();
	 static Queue<Kisiler> Kuyruk1 = new LinkedList<Kisiler>();
	 static Queue<Kisiler> Kuyruk2 = new LinkedList<Kisiler>();
	 static Queue<Kisiler> Kuyruk3 = new LinkedList<Kisiler>();
	 static Queue<Kisiler> Kuyruk4 = new LinkedList<Kisiler>();	
	 static JPanel contentPane = new JPanel();
	
	 static JFrame frame = new JFrame();
	 static JLabel floor0 = new JLabel("floor0");
	 static  JLabel floor2 = new JLabel("floor2");
	 static JLabel floor3 = new JLabel("floor3");
	 static  JLabel asansor4_3 = new JLabel("capacity: 10");
	 static  JLabel asansor5_1 = new JLabel("mode : idle");
	 static	JLabel floor1 = new JLabel("floor1");
	 static	JLabel floor4 = new JLabel("floor4");
	 static	JLabel lblNewLabel_8 = new JLabel("    ASANSOR 2");
	 static	JLabel queue0 = new JLabel();
	 static	JLabel asansor2_1 = new JLabel("mode : idle");
	 static	JLabel asansor2_2 = new JLabel("direction : up");
	 static	JLabel asansor2_3 = new JLabel("capacity: 10");
	 static JLabel asansor2_4 = new JLabel("inside : ");
	 static	JLabel asansor3_1 = new JLabel("mode : idle");
	 static	JLabel asansor3_2 = new JLabel("direction : up");
	 static	JLabel asansor3_3 = new JLabel("capacity: 10");
	 static	JLabel asansor3_4 = new JLabel("inside : ");
	 static	JLabel asansor4_1 = new JLabel("mode : idle");
	 static	JLabel asansor4_2 = new JLabel("direction : up");
	 static	JLabel asansor4_4 = new JLabel("inside : ");
	 static	JLabel asansor5_2 = new JLabel("direction : up");
	 static	JLabel asansor5_3 = new JLabel("capacity: 10");
	 static JLabel asansor5_4 = new JLabel("inside : ");
	 static	JLabel lblNewLabel_8_1 = new JLabel("    ASANSOR 3");
	 static	JLabel asansor1_1 = new JLabel("mode : working");
	 static	JLabel asansor1_2 = new JLabel("direction : up");
	 static JLabel asansor1_3 = new JLabel("capacity : 10");
	 static JLabel asansor1_4 = new JLabel("inside : ");
	 static	JLabel lblNewLabel_8_2 = new JLabel("    ASANSOR 4");
	 static	JLabel lblNewLabel_8_1_1 = new JLabel("    ASANSOR 5");
	 static	JLabel lblNewLabel_8_3 = new JLabel("    ASANSOR 1");
	static	JLabel queue1 = new JLabel("");
	static JLabel queue2 = new JLabel("");
	static JLabel queue3 = new JLabel("");
	static JLabel queue4 = new JLabel("");		
	
	 Cikis cikis = new Cikis(Kuyruk1,Kuyruk2,Kuyruk3,Kuyruk4,0,0);	
	
	 public Asansor(Queue<Kisiler> kuyruk0, boolean durum, int id, String mode, String direction,int capacity){
		
		this.Kuyruk0 = kuyruk0;
		durum = false;
		this.asansor_id = id;
		this.mode = mode;
		this.direction = direction;
		this.capacity = capacity;
			}
	 
	 public Asansor()
	 {
		 id_tut.add(0);
		 id_tut.add(0);

		 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(100, 100, 599, 768);	
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			frame.setContentPane(contentPane);
			contentPane.setLayout(null);			
			floor0.setBounds(10, 11, 348, 20);contentPane.add(floor0);floor2.setBounds(10, 59, 341, 26);contentPane.add(floor2);
			floor3.setBounds(10, 83, 331, 26);contentPane.add(floor3);asansor4_3.setBounds(454, 188, 341, 20);contentPane.add(asansor4_3);			
			asansor5_1.setBounds(454, 316, 372, 20);contentPane.add(asansor5_1);floor1.setBounds(10, 34, 348, 26);contentPane.add(floor1);					
			floor4.setBounds(10, 107, 408, 26);contentPane.add(floor4);lblNewLabel_8.setBounds(10, 172, 83, 53);contentPane.add(lblNewLabel_8);	
			queue0.setBounds(10, 599, 362, 26);contentPane.add(queue0);asansor2_1.setBounds(103, 144, 341, 20);	contentPane.add(asansor2_1);						
			asansor2_2.setBounds(103, 166, 341, 20);contentPane.add(asansor2_2);asansor2_3.setBounds(103, 188, 341, 20);contentPane.add(asansor2_3);						
			asansor2_4.setBounds(103, 219, 341, 20);contentPane.add(asansor2_4);asansor3_1.setBounds(103, 316, 341, 20);contentPane.add(asansor3_1);						
			asansor3_2.setBounds(103, 347, 341, 20);contentPane.add(asansor3_2);asansor3_3.setBounds(103, 377, 341, 20);contentPane.add(asansor3_3);			
			asansor3_4.setBounds(103, 402, 341, 20);contentPane.add(asansor3_4);asansor4_1.setBounds(454, 144, 341, 20);contentPane.add(asansor4_1);						
			asansor4_2.setBounds(454, 167, 341, 20);contentPane.add(asansor4_2);asansor4_4.setBounds(454, 210, 341, 20);contentPane.add(asansor4_4);
			asansor5_2.setBounds(454, 347, 341, 20);contentPane.add(asansor5_2);asansor5_3.setBounds(454, 371, 341, 20);contentPane.add(asansor5_3);			
			asansor5_4.setBounds(454, 402, 341, 20);contentPane.add(asansor5_4);asansor1_1.setBounds(259, 464, 341, 20);contentPane.add(asansor1_1);	
			asansor1_2.setBounds(259, 495, 341, 20);contentPane.add(asansor1_2);asansor1_3.setBounds(259, 524, 341, 20);contentPane.add(asansor1_3);			
			asansor1_4.setBounds(259, 554, 341, 20);contentPane.add(asansor1_4);lblNewLabel_8_1.setBounds(10, 344, 83, 53);contentPane.add(lblNewLabel_8_1);			
			lblNewLabel_8_2.setBounds(346, 155, 83, 53);contentPane.add(lblNewLabel_8_2);lblNewLabel_8_1_1.setBounds(346, 335, 83, 53);contentPane.add(lblNewLabel_8_1_1);			
			lblNewLabel_8_3.setBounds(114, 508, 83, 53);contentPane.add(lblNewLabel_8_3);queue1.setBounds(10, 625, 362, 26);contentPane.add(queue1);						
			queue2.setBounds(10, 649, 362, 26);contentPane.add(queue2);queue3.setBounds(10, 673, 362, 26);contentPane.add(queue3);queue4.setBounds(10, 700, 362, 26);contentPane.add(queue4);
			frame.getContentPane().setBackground(Color.gray);
			frame.setVisible(true);
	 } 
	
	@Override
	public void run() {
	
		while(Running)
		{			
			try {
				Thread.sleep(1000);					
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	

			synchronized (id_tut.get(0)) {

			    kontrol_size = 0;
			    sayac = Kuyruk0.element().Kisi_sayisi + sayac;	
			    
			    Kat0_Yazdir.add(Kuyruk0.element().Kisi_sayisi);
			    Kat0_Yazdir.add(Kuyruk0.element().Hedef_kat);
			    
			    if(sayac <= 10)
			    {						
			    	
			    	active =true;
			    	asansor_ici.add(new Kisiler(Kuyruk0.element().Kisi_sayisi,Kuyruk0.element().Hedef_kat));
			    	Kuyruk0.poll();			
			    }
			
			    else
			    {
			    	
			    	mode = "working";
			    	direction = "up";
			    	
			    	queue0.setText("0. floor : [ ");
			    	for(int i=0; i<Kat0_Yazdir.size();i +=2)
			    	{
					    queue0.setText(queue0.getText()+"("+Kat0_Yazdir.get(i)+""+","+Kat0_Yazdir.get(i+1)+""+")");
			    	}			    	
	
			    	queue0.setText(queue0.getText()+"]");
			    	asansor_id = id_tut.get(0);

			    	if(asansor_id == 0)
			    	{
			    		asansor1_1.setText("mode : "+mode+"");
			    		asansor1_2.setText("direction : "+direction+"");	            	 
			    		asansor1_3.setText("capacity : "+capacity+"");	            	 
			    		asansor1_4.setText("inside : [");	            	 
	            	
	            	 for(int i=0;i<asansor_ici.size();i++)
	            	 {
	            		 asansor1_4.setText(asansor1_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" )	;	
	            	 }
	            	 
	            	 asansor1_4.setText(asansor1_4.getText()+"]");	 
	             }
				 
				 else if(asansor_id == 1 )
	             {					 
	            	 asansor2_1.setText("mode : "+mode+"");
	            	 asansor2_2.setText("direction : "+direction+"");
	            	 asansor2_3.setText("capacity : "+capacity+"");
	            	 asansor2_4.setText("inside : [");
	            	 
	            	 for(int i=0;i<asansor_ici.size();i++)
	            	 {
	            		 asansor2_4.setText(asansor2_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" );
	            	 }
	            	 asansor2_4.setText(asansor2_4.getText()+"]");
	            }
				 else if(asansor_id == 2 )
	             {	
	            	 asansor3_1.setText("mode : "+mode+"");
	            	 asansor3_2.setText("direction : "+direction+"");
	            	 asansor3_3.setText("capacity : "+capacity+"");	 
	            	 asansor3_4.setText("inside : [");
	            	
	            	 for(int i=0;i<asansor_ici.size();i++)
	            	 {
	            		 asansor3_4.setText(asansor3_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" );         		 
	            	 }
	            	 
	            	asansor3_4.setText(asansor3_4.getText()+"]");	            	 
	             }
				 else if(asansor_id == 3 )
				 {					
	            	 asansor4_1.setText("mode : "+mode+"");
	            	 asansor4_2.setText("direction : "+direction+"");
	            	 asansor4_3.setText("capacity : "+capacity+"");
	            	 asansor4_4.setText("inside : [");
	            	
	            	 for(int i=0;i<asansor_ici.size();i++)
	            	 {
	            		 asansor4_4.setText(asansor4_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" );
	            	 }
	            	 asansor4_4.setText(asansor4_4.getText()+"]");
	            	 
	             }
				 else if(asansor_id == 4 )
	             {
					 asansor5_1.setText("mode : "+mode+"");
	            	 asansor5_2.setText("direction : "+direction+"");
	            	 asansor5_3.setText("capacity : "+capacity+"");
	            	 asansor5_4.setText("inside : [");
	            	 
	            	 for(int i=0;i<asansor_ici.size();i++)
	            	 {
	            	   	 asansor5_4.setText(asansor5_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" );
	            	 }
	            	 asansor5_4.setText(asansor5_4.getText()+"]");	            	 
	             }
						
				x= asansor_ici.size();			   
				
				while(i<x)
				{
					if(asansor_ici.get(i).Hedef_kat == 1)
					{						
						try {
							Thread.sleep(200);							
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}	
							
						Kat1(asansor_ici.get(i).Kisi_sayisi,i);						
						hedef_kat.add(1);
						x--;
						i=0;					
					}	
					else
					{
						i++;
					}				
				}				
				
				
				i=0;
				
				while(i<x)
				{
					if(asansor_ici.get(i).Hedef_kat == 2)
					{
						try {
							Thread.sleep(200);				
							
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}	
						Kat2(asansor_ici.get(i).Kisi_sayisi,i);
						hedef_kat.add(2);
						x--;
						i=0;
					}
					else
					{
						i++;
					}
					
				}
				
				try {
   					Thread.sleep(200);
   				} catch (InterruptedException e) {   					
   					e.printStackTrace();
   				}
				i=0;
				
				while(i<x)
				{
					if(asansor_ici.get(i).Hedef_kat == 3)
					{
						try {
							Thread.sleep(200);
	

						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}	
						Kat3(asansor_ici.get(i).Kisi_sayisi,i);		
						hedef_kat.add(3);
						x--;
						i=0;
					}
					else
					{
						i++;
					}							
				}
				
				try {
   					Thread.sleep(200);
   				} catch (InterruptedException e) {   					
   					e.printStackTrace();
   				}
				i=0;
				while(i<x)
				{
					if(asansor_ici.get(i).Hedef_kat == 4)
					{
						try {
							Thread.sleep(200);

			
							
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}	
						Kat4(asansor_ici.get(i).Kisi_sayisi,i);	
						hedef_kat.add(4);	
						x--;
						i=0;
					}
					else
					{
						i++;
					}
				}
				sayac_tut = sayac;
				sayac=0;
            
				Cikis_Belirleme();
				Cikis_Olusturma();  				
          }
		}	
    }
}
	

public void Kat1(int kisi_sayisi1,int index)
{ 
	asansor_ici.remove(index);		
	toplam1 += kisi_sayisi1;	
}

public void Kat2(int kisi_sayisi2, int index2)
{	
	asansor_ici.remove(index2);
	toplam2 += kisi_sayisi2 ;
}

public  void Kat3(int kisi_sayisi3, int index3)
{	
	asansor_ici.remove(index3);	
	toplam3 += kisi_sayisi3;	
}

public void Kat4(int kisi_sayisi4, int index4)
{
	asansor_ici.remove(index4);
	toplam4 += kisi_sayisi4;
}

public void Cikis_Belirleme()
{	
		Kuyruk1 = cikis.Cikis_Duzenle(Kuyruk1,Kuyruk2,Kuyruk3,Kuyruk4,toplam1,1);		
		Kuyruk2 = cikis.Cikis_Duzenle(Kuyruk1,Kuyruk2,Kuyruk3,Kuyruk4,toplam2,2);		
		Kuyruk3 = cikis.Cikis_Duzenle(Kuyruk1,Kuyruk2,Kuyruk3,Kuyruk4,toplam3,3);		
	    Kuyruk4 = cikis.Cikis_Duzenle(Kuyruk1,Kuyruk2,Kuyruk3,Kuyruk4,toplam4,4);	
		
		for(int i=0 ; i<cikis.Toplam_Tut.size();i++)
		{
			if(cikis.Kat_Tut.get(i)==1)
			{
				toplam1 = cikis.Toplam_Tut.get(i);
			}
			if(cikis.Kat_Tut.get(i)==2)
			{
				toplam2 = cikis.Toplam_Tut.get(i);	
			}
			if(cikis.Kat_Tut.get(i)==3)
			{
				toplam3 = cikis.Toplam_Tut.get(i);				
			}
			if(cikis.Kat_Tut.get(i)==4)
			{
				toplam4 = cikis.Toplam_Tut.get(i);
			}
		}	
		cikis.Toplam_Tut.clear();
		cikis.Kat_Tut.clear();
}

public void Cikis_Olusturma()
{		
	if(kuyruk_toplami <= 10)
	{					
		if(Kuyruk4.isEmpty() == false)
		{
			if((kuyruk_toplami + Kuyruk4.element().Kisi_sayisi) <= 10)		
			{
				asansor_ici.add(new Kisiler(Kuyruk4.element().Kisi_sayisi,0));
				kuyruk_toplami += Kuyruk4.element().Kisi_sayisi;
				int x = Kuyruk4.element().Kisi_sayisi;
				Kuyruk_Yazdir.add(4);
				Kuyruk_Yazdir.add(x);
				Kuyruk4.poll();		
		
			if(Kuyruk4.isEmpty() == false)
			{
				kontrol_toplam4 -= x;
				kontrol_toplam4 += Kuyruk4.element().Kisi_sayisi;
				Kuyruk_Yazdir.add(4);
				Kuyruk_Yazdir.add(Kuyruk4.element().Kisi_sayisi);
			}	
		}
		else if((kuyruk_toplami + Kuyruk4.element().Kisi_sayisi) > 10)
		{
			kontrol_toplam4 += Kuyruk4.element().Kisi_sayisi;
			Kuyruk_Yazdir.add(4);
			Kuyruk_Yazdir.add(Kuyruk4.element().Kisi_sayisi);
		}
			Toplam_Kontrol.add(kontrol_toplam4);		
	}		
 }  
	try {
			Thread.sleep(200);
		} catch (InterruptedException e) {   					
			e.printStackTrace();
		}

	if(kuyruk_toplami <= 10)
	{		
		if(Kuyruk3.isEmpty() == false)
		{					
			if((kuyruk_toplami + Kuyruk3.element().Kisi_sayisi) <= 10)
			{
				asansor_ici.add(new Kisiler(Kuyruk3.element().Kisi_sayisi,0));	
				kuyruk_toplami += Kuyruk3.element().Kisi_sayisi;
				int x = Kuyruk3.element().Kisi_sayisi;
				Kuyruk_Yazdir.add(3);
				Kuyruk_Yazdir.add(x);
				Kuyruk3.poll();				
				
				if(Kuyruk3.isEmpty() == false)
				{
					kontrol_toplam3 -= x;
					kontrol_toplam3 += Kuyruk3.element().Kisi_sayisi;
					Kuyruk_Yazdir.add(3);
					Kuyruk_Yazdir.add(Kuyruk3.element().Kisi_sayisi);
				}					
			}
			
			else if((kuyruk_toplami + Kuyruk3.element().Kisi_sayisi) > 10)
			{
				kontrol_toplam3 += Kuyruk3.element().Kisi_sayisi;
				Kuyruk_Yazdir.add(3);
				Kuyruk_Yazdir.add(Kuyruk3.element().Kisi_sayisi);
			}
			Toplam_Kontrol.add(kontrol_toplam3);
		}					
	}
	
	try {
			Thread.sleep(200);
		} catch (InterruptedException e) {   					
			e.printStackTrace();
		}

	if(kuyruk_toplami <= 10)
	{
		if(Kuyruk2.isEmpty() == false)
		{
			if((kuyruk_toplami + Kuyruk2.element().Kisi_sayisi) <= 10)
			{
				asansor_ici.add(new Kisiler(Kuyruk2.element().Kisi_sayisi,0));
				kuyruk_toplami += Kuyruk2.element().Kisi_sayisi;
				int x = Kuyruk2.element().Kisi_sayisi;
				Kuyruk_Yazdir.add(2);
				Kuyruk_Yazdir.add(x);
				Kuyruk2.poll();				
				
				if(Kuyruk2.isEmpty() == false)
				{
					kontrol_toplam2 -= x;
					kontrol_toplam2 += Kuyruk2.element().Kisi_sayisi;
					Kuyruk_Yazdir.add(2);
					Kuyruk_Yazdir.add(Kuyruk2.element().Kisi_sayisi);
				}				
			}
			else if((kuyruk_toplami + Kuyruk2.element().Kisi_sayisi) > 10)
			{
				kontrol_toplam2 += Kuyruk2.element().Kisi_sayisi;
				Kuyruk_Yazdir.add(2);
				Kuyruk_Yazdir.add(Kuyruk2.element().Kisi_sayisi);
			}
			Toplam_Kontrol.add(kontrol_toplam2);		
		}
	}
	
	try {
			Thread.sleep(200);
		} catch (InterruptedException e) {   					
			e.printStackTrace();
		}

	if(kuyruk_toplami <= 10)
	{
		if(Kuyruk1.isEmpty() == false)
		{			
			if((kuyruk_toplami + Kuyruk1.element().Kisi_sayisi) <= 10)
			{
				asansor_ici.add(new Kisiler(Kuyruk1.element().Kisi_sayisi,0));	
				kuyruk_toplami += Kuyruk1.element().Kisi_sayisi;
				int x = Kuyruk1.element().Kisi_sayisi;
				Kuyruk_Yazdir.add(1);
				Kuyruk_Yazdir.add(x);
				Kuyruk1.poll();
				
				if(Kuyruk1.isEmpty() == false)
				{
					kontrol_toplam1 -= x;
					kontrol_toplam1 += Kuyruk1.element().Kisi_sayisi;
					Kuyruk_Yazdir.add(1);
					Kuyruk_Yazdir.add(Kuyruk1.element().Kisi_sayisi);
				}						
			}
			else if((kuyruk_toplami + Kuyruk1.element().Kisi_sayisi) > 10)
			{				
				kontrol_toplam1 += Kuyruk1.element().Kisi_sayisi;
				Kuyruk_Yazdir.add(1);
				Kuyruk_Yazdir.add(Kuyruk1.element().Kisi_sayisi);
			}
			Toplam_Kontrol.add(kontrol_toplam1);		
		}
	}	
	try {
			Thread.sleep(200);
		} catch (InterruptedException e) {   					
			e.printStackTrace();
		}
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	for(int i=0; i<Kuyruk_Yazdir.size();i = i+2)
	{		
		if(Kuyruk_Yazdir.get(i) == 1)
		{			
			Kat1_Yazdir.add(Kuyruk_Yazdir.get(i+1));
		}
		if(Kuyruk_Yazdir.get(i) == 2)
		{
			
			Kat2_Yazdir.add(Kuyruk_Yazdir.get(i+1));
		}
		if(Kuyruk_Yazdir.get(i) == 3)
		{
			
			Kat3_Yazdir.add(Kuyruk_Yazdir.get(i+1));
		}
		if(Kuyruk_Yazdir.get(i) == 4)
		{
			
			Kat4_Yazdir.add(Kuyruk_Yazdir.get(i+1));
		}		
	}

	queue1.setText("1. floor : [ ");
	for(int i=0; i<Kat1_Yazdir.size();i++)
	{
		queue1.setText(queue1.getText()+ "(" + Kat1_Yazdir.get(i)+","+"0"+")" );
	}
	queue1.setText(queue1.getText()+"]");
	
	queue2.setText("2. floor : [ ");
	for(int i=0; i<Kat2_Yazdir.size();i++)
	{
		queue2.setText(queue2.getText()+ "(" + Kat2_Yazdir.get(i)+","+"0"+")" );
	}
	queue2.setText(queue2.getText()+"]");
	
	queue3.setText("3. floor : [ ");
	for(int i=0; i<Kat3_Yazdir.size();i++)
	{
		queue3.setText(queue3.getText()+ "(" + Kat3_Yazdir.get(i)+","+"0"+")" );
	}
	queue3.setText(queue3.getText()+"]");
	
	queue4.setText("4. floor : [ ");
	for(int i=0; i<Kat4_Yazdir.size();i++)
	{
		queue4.setText(queue4.getText()+ "(" + Kat4_Yazdir.get(i)+","+"0"+")" );
	}
    queue4.setText(queue4.getText()+"]");
	
	direction = "down";

	 if(asansor_id ==0 )
     { 
		
     asansor1_1.setText("mode : "+mode+"");
	 asansor1_2.setText("direction : "+direction+""); 
	 asansor1_3.setText("capacity : "+ capacity+"");	 
	 asansor1_4.setText("inside : [");	 
	
	 for(int i=0;i<asansor_ici.size();i++)
	 {
		 asansor1_4.setText(asansor1_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" );			
	 }
	 
	 asansor1_4.setText(asansor1_4.getText()+"]");
	
	 floor0.setText("0. floor : queue : " + sayac_tut);
     floor1.setText("1. floor : all " + toplam1 + " queue : " + kontrol_toplam1);
     floor2.setText("2. floor : all " + toplam2 + " queue : " + kontrol_toplam2);
   	 floor3.setText("3. floor : all " + toplam3 + " queue : " + kontrol_toplam3);
   	 floor4.setText("4. floor : all " + toplam4 + " queue : " + kontrol_toplam4);
    	
     }
	 else if(asansor_id == 1)
     {
		 asansor2_1.setText("mode : "+mode+"");
    	 asansor2_2.setText("direction : "+direction+"");
    	 asansor2_3.setText("capacity : "+capacity+"");
    	 asansor2_4.setText("inside : [");
    	 
    	 for(int i=0;i<asansor_ici.size();i++)
    	 {
    		 asansor2_4.setText(asansor2_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" );
    	 }
    	 asansor2_4.setText(asansor2_4.getText()+"]");
    	
    	 floor0.setText("0. floor : queue : " + sayac_tut);
     	 floor1.setText("1. floor : all " + toplam1 + " queue : " + kontrol_toplam1);
     	 floor2.setText("2. floor : all " + toplam2 + " queue : " + kontrol_toplam2);
     	 floor3.setText("3. floor : all " + toplam3 + " queue : " + kontrol_toplam3);
     	 floor4.setText("4. floor : all " + toplam4 + " queue : " + kontrol_toplam4);    	 
     }
	 else if(asansor_id == 2 )
     {
		 asansor3_1.setText("mode : "+mode+"");
    	 asansor3_2.setText("direction : "+direction+"");
    	 asansor3_3.setText("capacity : "+capacity+"");
    	 asansor3_4.setText("inside : [");
    	
    	 for(int i=0;i<asansor_ici.size();i++)
    	 {
    		 asansor3_4.setText(asansor3_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" );
    	 }
    	 
    	asansor3_4.setText(asansor3_4.getText()+"]");
    	floor0.setText("0. floor : queue : " + sayac_tut);
    	floor1.setText("1. floor : all " + toplam1 + " queue : " + kontrol_toplam1);
    	floor2.setText("2. floor : all " + toplam2 + " queue : " + kontrol_toplam2);
    	floor3.setText("3. floor : all " + toplam3 + " queue : " + kontrol_toplam3);
    	floor4.setText("4. floor : all " + toplam4 + " queue : " + kontrol_toplam4);
   	 
     }
	 else if(asansor_id == 3)
     {
		 
		 asansor4_1.setText("mode : "+mode+"");
    	 asansor4_2.setText("direction : "+direction+"");
    	 asansor4_3.setText("capacity : "+capacity+"");
    	 asansor4_4.setText("inside : [");
    	 for(int i=0;i<asansor_ici.size();i++)
    	 {
    		 asansor4_4.setText(asansor4_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" ); 
    	 }
    	asansor4_4.setText(asansor4_4.getText()+"]"); 
    	
    	floor0.setText("0. floor : queue : " + sayac_tut);
    	floor1.setText("1. floor : all " + toplam1 + " queue : " + kontrol_toplam1);
    	floor2.setText("2. floor : all " + toplam2 + " queue : " + kontrol_toplam2);
    	floor3.setText("3. floor : all " + toplam3 + " queue : " + kontrol_toplam3);
    	floor4.setText("4. floor : all " + toplam4 + " queue : " + kontrol_toplam4);
    	
     }
	 else if(asansor_id ==4 )
     {
		 asansor5_1.setText("mode : "+mode+"");
    	 asansor5_2.setText("direction : "+direction+"");
    	 asansor5_3.setText("capacity : "+capacity+""); 
    	 asansor5_4.setText("inside : [");    	 
    	 for(int i=0;i<asansor_ici.size();i++)
    	 {
    		 asansor5_4.setText(asansor5_4.getText()+ "(" + asansor_ici.get(i).Kisi_sayisi + "," + asansor_ici.get(i).Hedef_kat + ")" );
    	 }
    	 asansor5_4.setText(asansor5_4.getText()+"]");
    	 
    	 floor0.setText("0. floor : queue : " + sayac_tut);
    	 floor1.setText("1. floor : all " + toplam1 + " queue : " + kontrol_toplam1);    	
    	 floor2.setText("2. floor : all " + toplam2 + " queue : " + kontrol_toplam2);
    	 floor3.setText("3. floor : all " + toplam3 + " queue : " + kontrol_toplam3);
    	 floor4.setText("4. floor : all " + toplam4 + " queue : " + kontrol_toplam4);   	 
     }

	kuyruk_toplami=0;
	Kuyruk_Yazdir.clear();
	Kat0_Yazdir.clear();
	Kat1_Yazdir.clear();
	Kat2_Yazdir.clear();
	Kat3_Yazdir.clear();
	Kat4_Yazdir.clear();
	asansor_ici.clear();
	sync = 1;
	id_tut.remove(0);
}
public void shutdown()
{
	Running = false;
}
}