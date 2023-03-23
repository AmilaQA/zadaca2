import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Task 1

        System.out.println("Izracun kusura");

        System.out.println("-----------------");

        int racun = 1;
        int ukNovca = 100;
        int kusur = 0;
        int novcanica_20 = 0;
        int novcanica_10 = 0;
        int kovanica_2 = 0;
        int kovanica_1 = 0;

        kusur = ukNovca - racun;


        if (racun < 0) {
            System.out.println("Did you maybe break something ? ");
        } else if (racun <= 0) {
            System.out.println("You didn't by anything, did you ? ");
        } else if (ukNovca > 100) {
            System.out.println("You have too much money");
        } else {
            // example kusur: 95KM
            novcanica_20 = kusur / 20; // 4 * 20KM,  ostatak 15KM
            novcanica_10 = (kusur % 20) / 10; // 1 * 10KM,  ostatak 5KM
            kovanica_2 = ((kusur % 20) % 10) / 2; // 2 * 2KM, ostatak 1KM
            kovanica_1 = ((kusur % 20) % 10) % 2; // 1 * 1KM, ostatak 0KM

            System.out.println("Vas racun je: " + racun + " KM , a ukupan novac je: " + ukNovca + " KM ");
            System.out.println("Vas kusur je: " + kusur + " KM " + "\n Od tog novcanica od 20KM: " + novcanica_20 + "\n novcanica od 10KM: " + novcanica_10 + "\n kovanica od 2KM: " + kovanica_2 + "\n kovanica od 1KM: " + kovanica_1);
        }

        //task 2 Napravite program koji izracuna povrsinu kruga. (Bez hardkodiranja)sa ispisom u konzolu.

        int P_povKr = 0;
        int r_poluprKr = 4;
        double pi = 3.14;

        System.out.println("Povrsina kruga je: " + r_poluprKr * r_poluprKr * pi);

        //task 3 Napravite program gdje sam mogu da provjeravam da li je broj A,
        // djeljiv sa Brojem B (BEZ HARDKODIRANJA) sa ispisom u konzolu.

        int A = 15;

        if (A > 10000) {
            System.out.println("Broj je veci od 10000");
        } else if (A < 10) {
            System.out.println("Broj je manji od 10");
        } else if (A % 3 != 0) {
            System.out.println("Broj nije djeljiv sa 3");
        }
        int B = 1;
        if ((A % B) == 0) {
            System.out.println("Broj A je djeljiv sa brojem B");
        } else {
            System.out.println("Broj A nije djeljiv sa brojem B");
        }


        // task 4 Napravite program koji
        //   Ukoliko je broj A veci od broja B sabira ta dva broja
        //   Ukoliko je B veci od a Oduzima B od A
        //   Ukoliko su jednaki A i B mnozi ih
        //   za svaki od ovih uslova potreban je ispis.

        int broj_A = 10;
        int broj_B = 12;

        if (broj_A > broj_B) {
            System.out.println("Zbir brojeva A i B je: " + broj_A + broj_B);
        } else if (broj_B > broj_A) {
            System.out.println("Razlika brojeva B i A je: " + (broj_B - broj_A));
        } else if (broj_A == broj_B) {
            System.out.println("Proizvod brojeva A i B je: " + broj_A * broj_B);
        }

        // task 5 Iznos X plus taj isti iznos, plus 6, podjeljeno sa 2 minus inicijalni broj x,
        // zatim vidjeti da li je djeljivo sa dva

        int iznos_X = 5;
        int total = ((iznos_X + iznos_X + 6) / 2 - iznos_X);

        if (total % 2 == 0) {
            System.out.println("Djeljivo je sa 2 ");
        } else if (total % 2 != 0) {
            System.out.println("Nije djeljivo sa 2 ");
        }


        // task 6 NApraviti  logiku sa  varijablama A i B i C D
        //Ukoliko je A i B vece od nula ili  C i D vece od nula sabrati sve brojeve.
        //Nakon toga provjeriti da li je rezultat veci od 100 ukoliko jeste provjeriti
        //da li je djeljivo sa dva. Ukoliko je djeljivo sa dva podjeliti,
        // ukoliko nije uraditi minus jedan pa opet probati vidjeti da li je djeljivo sa dva
        // i ako jeste podjeliti sa dva.
        // Ukoliko nije ispisati “The number is still not divisible by 2”

        int var_A = 100;
        int var_B = 5;
        int var_C = 7;
        int var_D = 7;
        int zbirVar = 0;
        zbirVar = (var_A + var_B + var_C + var_D);

        if (((var_A > 0) && (var_B > 0)) || ((var_C > 0) && (var_D > 0))) {
            System.out.println("S obzirom da su vrijednosti varijabli vece od nula rezultat zbira varijabli je: " + (var_A + var_B + var_C + var_D));
        }
        if (zbirVar > 100) {
            System.out.println("Dobiveni rezultat je veci od 100");
        }
        if (zbirVar > 100) {
            System.out.println("Da li je dobiveni broj djeljiv sa 2? " + zbirVar % 2);
        }
        if ((zbirVar % 2) == 0) {
            System.out.println("Dobiveni rezultat nakon djeljenja sa 2 je: " + zbirVar / 2);
        } else if ((zbirVar - 1) % 2 == 0) {
            System.out.println("Dobiveni broj sa korekcijom je djeljiv sa 2 i rezultat je: " + (zbirVar - 1) / 2);
        } else {
            System.out.println("The number is still not divisible by 2");
        }
    }
}



