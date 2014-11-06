import java.util.*;

public class UtilTimer {
    public static void main(String args[]) {
        Timer timer;
        timer = new Timer();

        TimerTask task = new TimerTask() {
            int tic = 0;

            @Override
            public void run() {
                if (tic%2==0) {
                    System.out.println("TIC");
                } else {
                    System.out.println("TOC");
                }
                tic++;
            }
        };
        timer.schedule(task, 10, 1000);
    }
    
}