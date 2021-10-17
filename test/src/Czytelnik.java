
public class Czytelnik extends Osoba{

	private int n;
	private Ksi¹¿ka [] w;
	
	public Czytelnik()
	{
		super();
		n = 0;
		w = null;
	}
	
	public Czytelnik(String nazwisko, String pesel, int n)
	{
		super(nazwisko, pesel);
		w = new Ksi¹¿ka [this.n = n];
		
		/*for(int i = 0; i<w.length; i++)
		{
			w[i] = new Ksi¹¿ka();
		}*/
	}
	
	public double Oblicz()
	{
		double kwota = 0;
		for(int i = 0; i<w.length; i++)
		{
			kwota = kwota + w[i].getKara();
		}
		return kwota;
	}
	
	public void Wypo¿ycz(Ksi¹¿ka k)
	{
		for(int i =0; i<n; i++)
		{
			if(w[i] == null)
			{
				w[i] = k;
				i = n;
			}
		}
	}
	
	public void wyswietlWypozyczenia()
	{
		System.out.printf("Wypo¿yczenia: %n");
		if(w != null) 
		{
			for(int i = 0; i<n; i++)
			{
				System.out.printf("%s%n", w[i].toString());
			}
		}
		else System.out.printf("Brak wypo¿yczeñ%n");
	}
	
	public String toString()
	{
		if(w == null)
		{
			return "Czytelnik: " +super.toString() +"   " +"\t[n = " +n +"]\n";
		}
		else return "Czytelnik: " +super.toString() +"\t[n = " +n +"]\n";
	}
}
