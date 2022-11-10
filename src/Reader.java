import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) throws Exception {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r); //Reader ist eine superclass mit mehreren sub-classes damit es so wie eine verbesserte version von eine scanner sein kann.

        String name = "";

        while (!name.equals("stop")) {
            System.out.println("Enter data: ");
            name = br.readLine();
            System.out.println("data is: " + name);
        }

        br.close();
        r.close();
    }
}
