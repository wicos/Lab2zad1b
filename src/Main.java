public class Main {
    public static void main(String[] args)
    {

        Liczba nowaliczba = new Liczba();
       System.out.println (nowaliczba.getliczba ());


        if(nowaliczba.LiczbArmstronga ()){
            System.out.println ("This is Armstrong Number");
        }
       else{
            System.out.println ("This is not Armstrong Number");
        }

       TablicaLiczb nowatablica = new TablicaLiczb (20);
       nowatablica.wypelnienie ();
       nowatablica.wypisanie ();
       nowatablica.wyparm();


    }
}
