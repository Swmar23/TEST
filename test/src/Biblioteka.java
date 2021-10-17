
public class Biblioteka {

	Osoba [] tab = new Osoba[20];
	int n = 0;
	
	public static void main(String[] args) {

		Biblioteka b = new Biblioteka();
		b.tab[0] = new Pracownik("Kowalski", "12345678", "bibliotekarz", 2500, 11);
		b.tab[1] = new Pracownik();
		b.tab[2] = new Czytelnik();
		b.tab[3] = new Pracownik("Nowak", "23472345", "sprz靖acz", 1500, 8);
		b.tab[4] = new Pracownik("Wolska", "94653264", "bibliotekarka", 2600, 11);
		b.tab[5] = new Czytelnik("G這wacki", "86345134", 3);//
		b.tab[6] = new Czytelnik("Malska", "14734954", 5);//
		b.tab[7] = new Pracownik("Wolski", "64267843", "dyrektor", 2700, 13);
		
		for(int i = 0; i<b.tab.length; i++) 	//ile jest faktycznie osob w tablicy
		{
			if(b.tab[i] != null)
				b.n++;
		}
		System.out.printf("%d%n", b.n);
		
		for(int i = 0; i< b.n; i++)		//wyswietlanie wszystkich osob
		{
			System.out.printf("%s", b.tab[i].toString());
		}
		System.out.printf("%n");
		
		
		for(int i = 0; i< b.n; i++)		//wyswietlanie pracownikow
		{
			if(b.tab[i] instanceof Pracownik )
			{
				System.out.printf("%s", b.tab[i].toString());
				( (Pracownik)b.tab[i] ).wyietlLiczb燋adgodzin();
			}
				
		}
		
		((Czytelnik)b.tab[5] ).Wypozycz(new Ksiazka());
		((Czytelnik)b.tab[5] ).Wypozycz(new Ksiazka(96045, 2, true));
		((Czytelnik)b.tab[5] ).Wypozycz(new Ksiazka(76380, 1.5, false));
		((Czytelnik)b.tab[6] ).Wypozycz(new Ksiazka(23505, 3, false));
		((Czytelnik)b.tab[6] ).Wypozycz(new Ksiazka(14253, 1.7, false));
		((Czytelnik)b.tab[6] ).Wypozycz(new Ksiazka(26352, 2.4, true));
		((Czytelnik)b.tab[6] ).Wypozycz(new Ksiazka());
		((Czytelnik)b.tab[6] ).Wypozycz(new Ksiazka(50401, 1.9, false));
		
		for(int i = 0; i< b.n; i++)		//wyswietlanie czytelnikow
		{
			if(b.tab[i] instanceof Czytelnik )
			{
				System.out.printf("%s", b.tab[i].toString());
				( (Czytelnik)b.tab[i] ).wyswietlWypozyczenia();
				System.out.printf("%n");
			}
		}
		
		int l = 0;
		for(int i = 0; i< b.n; i++)
		{
			if( (b.tab[i] instanceof Pracownik) && ( ((Pracownik)b.tab[i]).jestBibliotekarzem() ))
			{
				l++;
			}
				
		}
		System.out.printf("Bibliotekarzy jest: %d%n%n", l);
		
		
		double max = 0;
		int msce = 0;
		for(int i = 0; i< b.n; i++)
		{
			if( (b.tab[i] instanceof Pracownik) )
			{
				if( ( (Pracownik)b.tab[i] ).Oblicz() > max )
				{
					max = ( (Pracownik)b.tab[i] ).Oblicz();
					msce = i;
				}
			}
				
		}
		System.out.printf("Najwi璚ej zarobi�: %s", ((Pracownik)b.tab[msce]).getStanowisko());
	}

}
