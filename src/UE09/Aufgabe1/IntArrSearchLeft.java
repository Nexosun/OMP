package UE09.Aufgabe1;

public class IntArrSearchLeft implements Runnable {
    int searchInt;
    int[] searchArr;
    boolean leftFound;

    public IntArrSearchLeft(int searchNumber, int[] intArray){      // default constructor to use given input int and intArray
    searchInt = searchNumber;
    searchArr = intArray;
    }

    @Override
    public void run() {
        for (int i = 0; i < searchArr.length / 2; i++) {            // iterate trough array
            if (searchArr[i] == searchInt) {
                leftFound = true;
            }
        }

        if (leftFound == true) {
            System.out.println("Thread 1: found");
        } else {
            System.out.println("Thread 1: not found");
        }
    }
}
