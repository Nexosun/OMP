package UE09.Aufgabe4;

import java.util.ArrayList;

public class NameOutput extends Thread{

    @Override
    public void run(){
    System.out.println(this.getName());     // print thread-name when run method is used
    }


    public static void main(String[] args) throws InterruptedException {
    int n = 3;

    for (int i = 0; i < n; i++){        // iterate and create n NameOutput threads
       NameOutput thread = new NameOutput();
       thread.start();                  // start the thread
       thread.join();                   // join to organize them
    }
    }

}
