import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] paises = {"Argentina", "Estados Unidos", "Canada", "Australia", "España"};
        HashMap<String, Integer> pbi = new HashMap<>();

        pbi.put("Argentina", 145);
        pbi.put("Peru", 142);
        pbi.put("Canda", 459);
        pbi.put("EEUU", 812);
        pbi.put("Alemania", 562);

        for (String valor : paises) {
            System.out.println(valor);
        }


        System.out.println("======================");
        System.out.println("Iterar sobre valores del HashMap");

        for (String valor : pbi.keySet()) {
            System.out.println(valor);
        }
    }
}
