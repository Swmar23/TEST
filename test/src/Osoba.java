
public abstract class Osoba {

	private String nazwisko;
	private String pesel;
	
	public Osoba() 
	{
		nazwisko = "";
		pesel = "";
	}
	
	public Osoba(String nazwisko, String pesel)
	{
		this.nazwisko = nazwisko;
		this.pesel = pesel;
	}
	
	public String getNazwisko()
	{
		return nazwisko;
	}
	
	public abstract double Oblicz();
	
	public String toString()
	{
		if((nazwisko.equals("")) && (pesel.equals("")))
		{
			return "Nazwisko: " +nazwisko +"   "+ "\tPesel: " +pesel;
		}
		else return "Nazwisko: " +nazwisko +"\tPesel: " +pesel;
	}
	
	
}
