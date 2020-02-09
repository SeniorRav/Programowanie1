package threads.basics;
import static threads.ThreadColor.ANSI_RED;

public class RunnableSample implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED +"Runnable sample working" );

    }
}
