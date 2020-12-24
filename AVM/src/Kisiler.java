public class Kisiler {

	int Kisi_sayisi;
	int Hedef_kat;
	
public Kisiler(int Kisi_sayisi,int Hedef_kat)
{
	this.Hedef_kat = Hedef_kat;
	this.Kisi_sayisi = Kisi_sayisi;
	
}

public String yazdir()
{
	return Kisi_sayisi+" "+ Hedef_kat;
	
}
	
}