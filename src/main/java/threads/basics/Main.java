package threads.basics;

import static threads.ThreadColor.*;

public class Main {

    public static void main(String[] args){
        System.out.println(ANSI_PURPLE +"Main thread in action");

        Thread otherThread = new OtherThread();
        otherThread.setName("====Other Thread====");
        otherThread.start();  //wywolujemy start() mimo że przeładowaliśmy metode run()

        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();

        System.out.println(ANSI_PURPLE+"End of main");

        //wątek w klasie anonimowej

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Anonymous class based thread");
            }
        }.start();

        runnableSample = new Thread(new RunnableSample() {
            @Override
            public void run(){
                System.out.println(ANSI_RED+"overridden RunnableSample");
            try{
                otherThread.join();
                System.out.println(ANSI_RED+"Other thread terminated"
                        +" so I woke again");
            }catch (InterruptedException e){
                System.out.println(ANSI_RED+"overriden Runnable terminated");
            }
        }


        });

        runnableSample.start();
        //otherThread.interrupt();
    }

}
