public class ProgCalendario 
{
    public static void main(String[] args) 
    {
        Calendario C = new Calendario(29, 2, 2024);
        
        C.AnnoBisestile();
        C.Calcolo();
    }  
}
