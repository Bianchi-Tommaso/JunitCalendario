public class ProgCalendario 
{
    public static void main(String[] args) 
    {
        Calendario C = new Calendario(28, 2, 2021);
        
        C.AnnoBisestile();
        C.Calcolo();
    }  
}
