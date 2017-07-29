package Infrastructure;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Vitaliy Tsvetkov on 21.07.2017.
 */
public class TestLogger {

    private int step = 1;
    // 1) 10:34:09.235 [main]: Start browser

    public void log(String msg) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        String timestamp = sdf.format(new Date());

        String thread = Thread.currentThread().getName();

        msg = step + ") " + timestamp + " [" + thread + "]: " + msg;
        System.out.println(msg);

        step++;
    }
}
