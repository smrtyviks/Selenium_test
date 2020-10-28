package stepDefinitons;

import io.cucumber.java.nl.Stel;
import org.apache.commons.lang3.time.StopWatch;
import org.testng.annotations.Test;

public class testtimer {
    @Test
    public static void gettimer() throws Throwable{
        int period=25;
        //Create new stopwatch timer
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        while(period>0) {
            System.out.println(period);

            Thread.sleep(1000);
            period=period-1;
        }
        //Get the timer and put it in a variable
        stopwatch.stop();
        long x = stopwatch.getTime();


        System.out.println(x);

    }

}
