import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Adrian on 03.08.2016.
 */
public class ListToMap {
    public static void mapcreate(List<String> t) {
        Map<String, List<Oras>> map = new HashMap<>();

        for (int a = 0; a < t.size(); a++) {
            Oras o = new Oras(t.get(a));

            if (map.containsKey(o.getRegiune())) {
                List<Oras> oraseleRegiunii = map.get(o.getRegiune());
                oraseleRegiunii.add(o);

            } else {
                List<Oras> lista = new ArrayList<>();
                lista.add(o);
                map.put(o.getRegiune(), lista);

            }
            // System.out.println(t.get(a));
        }
        for (String reg : map.keySet()) {
 //           System.out.println(reg + ":" + map.get(reg));
            List<Oras> oraseleRegiunii = map.get(reg);
            System.out.println("\n-----------");
            System.out.println("Regiunea: " + reg);
            System.out.println("-----------");
            int pop = 0;
            for(Oras oras: oraseleRegiunii) {
                System.out.print(oras.getNume() + " ");
                System.out.println(oras.getPopulatie());
                pop = pop+oras.getPopulatie();
            }
            System.out.println("-----------");
            System.out.println("Populatia este: " + pop);
        }
    }
}
