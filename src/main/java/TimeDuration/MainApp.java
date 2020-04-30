package TimeDuration;

import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        TimeDuration time = new TimeDuration(0);
           time.toString();
        TimeDuration time = new TimeDuration(732);
        time.toString();
        TimeDuration time = new TimeDuration(7242);
        time.toString();
    }

}

