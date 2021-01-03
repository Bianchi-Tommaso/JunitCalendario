
import java.util.GregorianCalendar;

public class Calendario
{
    public int Giorno;
    public int Mese;
    public int Anno;
    
    public Calendario()
    {
        Giorno = 0;
        Mese = 0;
        Anno = 0;
    }
    
    public Calendario(int Giorno, int Mese, int Anno)
    {
        this.Giorno = Giorno;
        this.Mese = Mese;
        this.Anno = Anno;
    }
    
    public void AnnoBisestile()
    {
        boolean Bisestile = false;
        
        if(Anno % 400 == 0 || Anno % 4 == 0 && !(Anno % 100 == 0))
        {
            System.out.println("L'Anno E' Bisestile: ");
            Bisestile = true;
        }
        
        if(Bisestile == false)
        {
            if(Mese == 2 && Giorno == 29)
            {
                System.out.println("L'anno Inserito Non E' Bisestile, Quindi E' Impossibile Che Ci Sia Il 29 Febbraio");
                System.exit(0);
            }
            System.out.println("L'Anno Non E' Bisestile: ");
        }
    }
    
    public void Calcolo()
    {
       
        GregorianCalendar CalcoloGiorno = new GregorianCalendar();
        
        CalcoloGiorno.set(GregorianCalendar.DAY_OF_MONTH, Giorno);
        CalcoloGiorno.set(GregorianCalendar.MONTH, Mese - 1);
        CalcoloGiorno.set(GregorianCalendar.YEAR, Anno);
        
        System.out.println("Il Numero Progressivo Di Questo Giorno All'interno Dell'Anno E': " + CalcoloGiorno.get(GregorianCalendar.DAY_OF_YEAR));
    }  
    
}
