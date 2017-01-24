import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dneubauer on 12.01.2017.
 */
public class Main {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("A(B)(C)((D)E)");
        Matcher m = p.matcher("ABCDE");

        while (m.find()){

            for (int i = 0; i < m.groupCount()+ 1; i++){
                System.out.println( i + " : " + m.group(i));
            }

        }

    }
}
