package UE09.Aufgabe1;

public class IntArrSearchTest {
    public static void main(String[] args) {        // when uneven array then left side is 1 smaller
        int[] intArr = new int[]{2, 7, 3, 9, 23};
        int search = 3;

        IntArrSearchLeft threadLeft = new IntArrSearchLeft(search,intArr);      // thread 1 left to middle
        Thread t1 = new Thread(threadLeft);         // create thread.object
        t1.start();

        IntArrSearchRight threadRight = new IntArrSearchRight(search,intArr);   // thread 2 right to middle
        Thread t2 = new Thread(threadRight);
        t2.start();

        while(t1.isAlive() || t2.isAlive()){        // wait till both threads are done
        }

        if (threadLeft.leftFound || threadRight.rightFound){
            System.out.println("Found: true");
        } else {
            System.out.println("Found: false");
        }

    }
}
