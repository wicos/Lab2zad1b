public class Liczba {
    private int a;
    private int b;
    private int rand;


    public Liczba() {
        a = 100;
        b = 500;
        rand = (int) Math.floor (Math.random () * (b - a + 1) + a);
    }

    public int getliczba() {
        return rand;
    }


    public int dlugosc() {
        String s = Integer.toString (rand);
        int dl = s.length ();
        return dl;
    }

    public boolean LiczbArmstronga() {

        int suma = 0;
        double arm = 0;
        int pom = 0;
        int pom2 = 0;
        int random = rand;
        pom2 = random;
        int dl = dlugosc ();
        while (random > 0) {
            pom = random % 10;
            arm = arm + Math.pow (pom, dl);
            suma = suma + pom;
            random = random / 10;

        }
        int armstrong = (int) arm;
        if (pom2 == armstrong) {
            return true;
        } else {
            return false;
        }


    }

}