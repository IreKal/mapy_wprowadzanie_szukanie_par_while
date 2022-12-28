import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,String> pary = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String Stolica, Panstwo;

        while (true)
            System.out.println("podaj nazwe Panstwa, aby przerwac wcisnij / ");
        Panstwo = scan.next();
        if (Panstwo.equals("/")) {

        }

        System.out.println("podaj nazwe stolicy ,aby przerwac wcisnij / ");
        Stolica = scan.next();
        if (Stolica.equals("/")){

        }
        pary.put(Panstwo, Stolica);

    }
}