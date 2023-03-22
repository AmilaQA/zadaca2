public class Main {
    public static void main(String[] args) {

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


        if (racun < 0){
            System.out.println("Did you maybe break something ? ");
        }
        else if (racun == 0){
            System.out.println("You didn't by anything, did you ? ");
        }
        else if (ukNovca > 100){
            System.out.println("You have too much money");
        }

        else {
            // example kusur: 95KM
            novcanica_20 = kusur/20; // 4 * 20KM,  ostatak 15KM
            novcanica_10 = (kusur%20)/10; // 1 * 10KM,  ostatak 5KM
            kovanica_2 = ((kusur%20)%10)/2; // 2 * 2KM, ostatak 1KM
            kovanica_1 = ((kusur%20)%10)%2; // 1 * 1KM, ostatak 0KM

            System.out.println("Vas racun je: " + racun + " KM , a ukupan novac je: " + ukNovca + " KM ");
            System.out.println("Vas kusur je: " + kusur + " KM "+ "\n Od tog novcanica od 20KM: " + novcanica_20  + "\n novcanica od 10KM: " + novcanica_10 + "\n kovanica od 2KM: " + kovanica_2 + "\n kovanica od 1KM: " + kovanica_1);
        }

    }
}