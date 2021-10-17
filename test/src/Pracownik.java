import java.util.Random;

public class Pracownik extends Osoba{

	private String stanowisko;
	private int pensja;
	private int stawka;
	private int [] t = new int [6];
	
	public Pracownik()
	{
		super();
		stanowisko = "brak";
		pensja = 0;
		stawka = 0;
		t = null;
	}
	
	public Pracownik(String nazwisko, String pesel, String stanowisko, int pensja, int stawka)
	{
		super(nazwisko, pesel);
		this.stanowisko = stanowisko;
		this.pensja = pensja;
		this.stawka = stawka;
		Random generator = new Random();
		for(int i = 0; i<t.length; i++)
		{
			t[i] = generator.nextInt(4);
		}
	}
	
	public double Oblicz()
	{
		if(t != null)
			{
				int nadgodziny = 0;
				for(int i = 0; i<t.length; i++)
					nadgodziny= nadgodziny + t[i]; // nadgodziny+=t[i]
				return pensja+(stawka*nadgodziny);
			}
		else return 0;
	}
	
	public void wyswietlLiczbeNadgodzin()
	{
		System.out.printf("Nadgodziny: %n");
		if(t != null)
			System.out.printf("Poniedzia³ek: %d%nWtorek: %d%nŒroda: %d%nCzwartek: %d%nPi¹tek: %d%nSobota: %d%n%n", t[0],t[1],t[2],t[3],t[4],t[5] );
		else System.out.printf("Brak nadgodzin%n%n");
	}
	
	public String getStanowisko()
	{
		return stanowisko;
	}
	
	public boolean jestBibliotekarzem()
	{
		if(stanowisko == "bibliotekarz") return true;
		else if(stanowisko == "bibliotekarka") return true;
		else return false;
	}
	
	public String toString()
	{
		if(t == null)
		{
			return "Pracownik: " +super.toString() +"   " +"\t[stanowisko = " +stanowisko +", pensja = " +pensja +", stawka = "+stawka +"]\n";
		}
		return "Pracownik: " +super.toString() + "\t[stanowisko = " +stanowisko +", pensja = " +pensja +", stawka = "+stawka +"]\n";
	}
}
