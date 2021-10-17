
public class Ksi¹¿ka {

	private int sygnatura;
	private double kara;
	private boolean czyOddana_w_terminie;
	
	public Ksi¹¿ka()
	{
		sygnatura = 0;
		kara = 0;
		czyOddana_w_terminie = true;
	}

	public Ksi¹¿ka(int sygnatura, double kara, boolean zwrot)
	{
		this.sygnatura = sygnatura;
		if(zwrot == true)
		{
			this.czyOddana_w_terminie = true;
			this.kara = 0;
		}
		else
		{
			this.czyOddana_w_terminie = false;
			this.kara = kara;
		}
		
	}
	
	public double getKara()
	{
		return kara;
	}
	
	
	public String toString()
	{
		if(sygnatura == 0)
		{
			return "Sygnatura: " +sygnatura +"    "+"\tCzy oddana w terminie: " +czyOddana_w_terminie +"\tKara: " +kara;
		}
		return "Sygnatura: " +sygnatura +"\tCzy oddana w terminie: " +czyOddana_w_terminie +"\tKara: " +kara;
	}
	
}	
