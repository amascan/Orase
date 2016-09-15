import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 29.07.2016.
 */
public class Citire {
    public static List read(String tmp) {
        BufferedReader bufIn = null;
        List<String> templist = new ArrayList<String>();
        try {
            bufIn = new BufferedReader(new FileReader(tmp));

            String e;
            while ((e = bufIn.readLine()) != null) {
                System.out.println(e);
                templist.add(e);
                System.out.println(templist.size());
            }
        } catch (IOException var11) {
            System.err.println(var11);
        } finally {
            if (bufIn != null) {
                try {
                    bufIn.close();
                } catch (IOException var10) {
                    System.err.println(var10);
                }
            }

  //          for (int i = 0; i < templist.size(); i++) {
  //              System.out.println(templist.get(i));
 //           }
            return templist;
        }

    }
}